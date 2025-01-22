package com.dao;

import com.entity.KechengxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengxuexiVO;
import com.entity.view.KechengxuexiView;


/**
 * 课程学习
 * 
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public interface KechengxuexiDao extends BaseMapper<KechengxuexiEntity> {
	
	List<KechengxuexiVO> selectListVO(@Param("ew") Wrapper<KechengxuexiEntity> wrapper);
	
	KechengxuexiVO selectVO(@Param("ew") Wrapper<KechengxuexiEntity> wrapper);
	
	List<KechengxuexiView> selectListView(@Param("ew") Wrapper<KechengxuexiEntity> wrapper);

	List<KechengxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<KechengxuexiEntity> wrapper);
	
	KechengxuexiView selectView(@Param("ew") Wrapper<KechengxuexiEntity> wrapper);
	

}
