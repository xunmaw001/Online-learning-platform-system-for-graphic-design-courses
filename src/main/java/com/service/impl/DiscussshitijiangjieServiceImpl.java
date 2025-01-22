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


import com.dao.DiscussshitijiangjieDao;
import com.entity.DiscussshitijiangjieEntity;
import com.service.DiscussshitijiangjieService;
import com.entity.vo.DiscussshitijiangjieVO;
import com.entity.view.DiscussshitijiangjieView;

@Service("discussshitijiangjieService")
public class DiscussshitijiangjieServiceImpl extends ServiceImpl<DiscussshitijiangjieDao, DiscussshitijiangjieEntity> implements DiscussshitijiangjieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshitijiangjieEntity> page = this.selectPage(
                new Query<DiscussshitijiangjieEntity>(params).getPage(),
                new EntityWrapper<DiscussshitijiangjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshitijiangjieEntity> wrapper) {
		  Page<DiscussshitijiangjieView> page =new Query<DiscussshitijiangjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshitijiangjieVO> selectListVO(Wrapper<DiscussshitijiangjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshitijiangjieVO selectVO(Wrapper<DiscussshitijiangjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshitijiangjieView> selectListView(Wrapper<DiscussshitijiangjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshitijiangjieView selectView(Wrapper<DiscussshitijiangjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
