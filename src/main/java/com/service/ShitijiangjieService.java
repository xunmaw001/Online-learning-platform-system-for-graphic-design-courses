package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShitijiangjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShitijiangjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShitijiangjieView;


/**
 * 试题讲解
 *
 * @author 
 * @email 
 * @date 2022-01-04 15:17:01
 */
public interface ShitijiangjieService extends IService<ShitijiangjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShitijiangjieVO> selectListVO(Wrapper<ShitijiangjieEntity> wrapper);
   	
   	ShitijiangjieVO selectVO(@Param("ew") Wrapper<ShitijiangjieEntity> wrapper);
   	
   	List<ShitijiangjieView> selectListView(Wrapper<ShitijiangjieEntity> wrapper);
   	
   	ShitijiangjieView selectView(@Param("ew") Wrapper<ShitijiangjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShitijiangjieEntity> wrapper);
   	

}

