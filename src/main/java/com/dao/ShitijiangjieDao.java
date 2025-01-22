package com.dao;

import com.entity.ShitijiangjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShitijiangjieVO;
import com.entity.view.ShitijiangjieView;


/**
 * 试题讲解
 * 
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public interface ShitijiangjieDao extends BaseMapper<ShitijiangjieEntity> {
	
	List<ShitijiangjieVO> selectListVO(@Param("ew") Wrapper<ShitijiangjieEntity> wrapper);
	
	ShitijiangjieVO selectVO(@Param("ew") Wrapper<ShitijiangjieEntity> wrapper);
	
	List<ShitijiangjieView> selectListView(@Param("ew") Wrapper<ShitijiangjieEntity> wrapper);

	List<ShitijiangjieView> selectListView(Pagination page,@Param("ew") Wrapper<ShitijiangjieEntity> wrapper);
	
	ShitijiangjieView selectView(@Param("ew") Wrapper<ShitijiangjieEntity> wrapper);
	

}
