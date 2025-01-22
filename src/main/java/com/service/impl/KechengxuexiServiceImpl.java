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


import com.dao.KechengxuexiDao;
import com.entity.KechengxuexiEntity;
import com.service.KechengxuexiService;
import com.entity.vo.KechengxuexiVO;
import com.entity.view.KechengxuexiView;

@Service("kechengxuexiService")
public class KechengxuexiServiceImpl extends ServiceImpl<KechengxuexiDao, KechengxuexiEntity> implements KechengxuexiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengxuexiEntity> page = this.selectPage(
                new Query<KechengxuexiEntity>(params).getPage(),
                new EntityWrapper<KechengxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengxuexiEntity> wrapper) {
		  Page<KechengxuexiView> page =new Query<KechengxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengxuexiVO> selectListVO(Wrapper<KechengxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengxuexiVO selectVO(Wrapper<KechengxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengxuexiView> selectListView(Wrapper<KechengxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengxuexiView selectView(Wrapper<KechengxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
