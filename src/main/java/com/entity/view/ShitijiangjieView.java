package com.entity.view;

import com.entity.ShitijiangjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 试题讲解
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
@TableName("shitijiangjie")
public class ShitijiangjieView  extends ShitijiangjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShitijiangjieView(){
	}
 
 	public ShitijiangjieView(ShitijiangjieEntity shitijiangjieEntity){
 	try {
			BeanUtils.copyProperties(this, shitijiangjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
