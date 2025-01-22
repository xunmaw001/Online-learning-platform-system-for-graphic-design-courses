package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskechengxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskechengxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskechengxuexiView;


/**
 * 课程学习评论表
 *
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public interface DiscusskechengxuexiService extends IService<DiscusskechengxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskechengxuexiVO> selectListVO(Wrapper<DiscusskechengxuexiEntity> wrapper);
   	
   	DiscusskechengxuexiVO selectVO(@Param("ew") Wrapper<DiscusskechengxuexiEntity> wrapper);
   	
   	List<DiscusskechengxuexiView> selectListView(Wrapper<DiscusskechengxuexiEntity> wrapper);
   	
   	DiscusskechengxuexiView selectView(@Param("ew") Wrapper<DiscusskechengxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskechengxuexiEntity> wrapper);
   	

}

