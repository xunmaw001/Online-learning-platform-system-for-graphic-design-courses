package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShitijiangjieDao;
import com.entity.ShitijiangjieEntity;
import com.service.ShitijiangjieService;
import com.entity.vo.ShitijiangjieVO;
import com.entity.view.ShitijiangjieView;

@Service("shitijiangjieService")
public class ShitijiangjieServiceImpl extends ServiceImpl<ShitijiangjieDao, ShitijiangjieEntity> implements ShitijiangjieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShitijiangjieEntity> page = this.selectPage(
                new Query<ShitijiangjieEntity>(params).getPage(),
                new EntityWrapper<ShitijiangjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShitijiangjieEntity> wrapper) {
		  Page<ShitijiangjieView> page =new Query<ShitijiangjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShitijiangjieVO> selectListVO(Wrapper<ShitijiangjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShitijiangjieVO selectVO(Wrapper<ShitijiangjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShitijiangjieView> selectListView(Wrapper<ShitijiangjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShitijiangjieView selectView(Wrapper<ShitijiangjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
