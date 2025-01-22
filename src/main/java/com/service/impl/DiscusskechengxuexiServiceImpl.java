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


import com.dao.DiscusskechengxuexiDao;
import com.entity.DiscusskechengxuexiEntity;
import com.service.DiscusskechengxuexiService;
import com.entity.vo.DiscusskechengxuexiVO;
import com.entity.view.DiscusskechengxuexiView;

@Service("discusskechengxuexiService")
public class DiscusskechengxuexiServiceImpl extends ServiceImpl<DiscusskechengxuexiDao, DiscusskechengxuexiEntity> implements DiscusskechengxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskechengxuexiEntity> page = this.selectPage(
                new Query<DiscusskechengxuexiEntity>(params).getPage(),
                new EntityWrapper<DiscusskechengxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskechengxuexiEntity> wrapper) {
		  Page<DiscusskechengxuexiView> page =new Query<DiscusskechengxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskechengxuexiVO> selectListVO(Wrapper<DiscusskechengxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskechengxuexiVO selectVO(Wrapper<DiscusskechengxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskechengxuexiView> selectListView(Wrapper<DiscusskechengxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskechengxuexiView selectView(Wrapper<DiscusskechengxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
