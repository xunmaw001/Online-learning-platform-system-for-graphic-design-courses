package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshitijiangjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshitijiangjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshitijiangjieView;


/**
 * 试题讲解评论表
 *
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public interface DiscussshitijiangjieService extends IService<DiscussshitijiangjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshitijiangjieVO> selectListVO(Wrapper<DiscussshitijiangjieEntity> wrapper);
   	
   	DiscussshitijiangjieVO selectVO(@Param("ew") Wrapper<DiscussshitijiangjieEntity> wrapper);
   	
   	List<DiscussshitijiangjieView> selectListView(Wrapper<DiscussshitijiangjieEntity> wrapper);
   	
   	DiscussshitijiangjieView selectView(@Param("ew") Wrapper<DiscussshitijiangjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshitijiangjieEntity> wrapper);
   	

}

