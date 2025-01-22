package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengxuexiView;


/**
 * 课程学习
 *
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public interface KechengxuexiService extends IService<KechengxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengxuexiVO> selectListVO(Wrapper<KechengxuexiEntity> wrapper);
   	
   	KechengxuexiVO selectVO(@Param("ew") Wrapper<KechengxuexiEntity> wrapper);
   	
   	List<KechengxuexiView> selectListView(Wrapper<KechengxuexiEntity> wrapper);
   	
   	KechengxuexiView selectView(@Param("ew") Wrapper<KechengxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengxuexiEntity> wrapper);
   	

}

