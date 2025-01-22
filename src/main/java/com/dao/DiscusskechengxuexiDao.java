package com.dao;

import com.entity.DiscusskechengxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskechengxuexiVO;
import com.entity.view.DiscusskechengxuexiView;


/**
 * 课程学习评论表
 * 
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public interface DiscusskechengxuexiDao extends BaseMapper<DiscusskechengxuexiEntity> {
	
	List<DiscusskechengxuexiVO> selectListVO(@Param("ew") Wrapper<DiscusskechengxuexiEntity> wrapper);
	
	DiscusskechengxuexiVO selectVO(@Param("ew") Wrapper<DiscusskechengxuexiEntity> wrapper);
	
	List<DiscusskechengxuexiView> selectListView(@Param("ew") Wrapper<DiscusskechengxuexiEntity> wrapper);

	List<DiscusskechengxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskechengxuexiEntity> wrapper);
	
	DiscusskechengxuexiView selectView(@Param("ew") Wrapper<DiscusskechengxuexiEntity> wrapper);
	

}
