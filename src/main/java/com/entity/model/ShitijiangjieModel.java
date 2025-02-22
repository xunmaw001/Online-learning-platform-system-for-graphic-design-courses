package com.entity.model;

import com.entity.ShitijiangjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 试题讲解
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public class ShitijiangjieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
