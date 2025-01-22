package com.entity.view;

import com.entity.DiscusskechengxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程学习评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
@TableName("discusskechengxuexi")
public class DiscusskechengxuexiView  extends DiscusskechengxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskechengxuexiView(){
	}
 
 	public DiscusskechengxuexiView(DiscusskechengxuexiEntity discusskechengxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, discusskechengxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
