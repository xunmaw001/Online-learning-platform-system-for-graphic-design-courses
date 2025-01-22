package com.dao;

import com.entity.DiscussshitijiangjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshitijiangjieVO;
import com.entity.view.DiscussshitijiangjieView;


/**
 * 试题讲解评论表
 * 
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public interface DiscussshitijiangjieDao extends BaseMapper<DiscussshitijiangjieEntity> {
	
	List<DiscussshitijiangjieVO> selectListVO(@Param("ew") Wrapper<DiscussshitijiangjieEntity> wrapper);
	
	DiscussshitijiangjieVO selectVO(@Param("ew") Wrapper<DiscussshitijiangjieEntity> wrapper);
	
	List<DiscussshitijiangjieView> selectListView(@Param("ew") Wrapper<DiscussshitijiangjieEntity> wrapper);

	List<DiscussshitijiangjieView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshitijiangjieEntity> wrapper);
	
	DiscussshitijiangjieView selectView(@Param("ew") Wrapper<DiscussshitijiangjieEntity> wrapper);
	

}
