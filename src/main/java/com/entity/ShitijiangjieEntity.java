package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 试题讲解
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
@TableName("shitijiangjie")
public class ShitijiangjieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShitijiangjieEntity() {
		
	}
	
	public ShitijiangjieEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 试卷名称
	 */
					
	private String shijuanmingcheng;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 讲解文件
	 */
					
	private String jiangjiewenjian;
	
	/**
	 * 讲解视频
	 */
					
	private String jiangjieshipin;
	
	/**
	 * 讲解内容
	 */
					
	private String jiangjieneirong;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：试卷名称
	 */
	public void setShijuanmingcheng(String shijuanmingcheng) {
		this.shijuanmingcheng = shijuanmingcheng;
	}
	/**
	 * 获取：试卷名称
	 */
	public String getShijuanmingcheng() {
		return shijuanmingcheng;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：讲解文件
	 */
	public void setJiangjiewenjian(String jiangjiewenjian) {
		this.jiangjiewenjian = jiangjiewenjian;
	}
	/**
	 * 获取：讲解文件
	 */
	public String getJiangjiewenjian() {
		return jiangjiewenjian;
	}
	/**
	 * 设置：讲解视频
	 */
	public void setJiangjieshipin(String jiangjieshipin) {
		this.jiangjieshipin = jiangjieshipin;
	}
	/**
	 * 获取：讲解视频
	 */
	public String getJiangjieshipin() {
		return jiangjieshipin;
	}
	/**
	 * 设置：讲解内容
	 */
	public void setJiangjieneirong(String jiangjieneirong) {
		this.jiangjieneirong = jiangjieneirong;
	}
	/**
	 * 获取：讲解内容
	 */
	public String getJiangjieneirong() {
		return jiangjieneirong;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}

}
