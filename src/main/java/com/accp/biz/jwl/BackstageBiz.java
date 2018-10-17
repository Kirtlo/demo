package com.accp.biz.jwl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.jwl.IBackstageDao;
import com.accp.pojo.*;
import com.accp.vo.jwl.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class BackstageBiz {
	@Autowired
	private IBackstageDao dao;
	
	public PageInfo<Sharea> queryAllArea(Integer pid,Integer p,Integer s){
		PageHelper.startPage(p, s);
		return new PageInfo<Sharea>(dao.queryAllArea(pid));
	}
	
	public Sharea queryBy(Integer id){
		return dao.queryById(id);
	}
	
	public List<Advertisementtype> queryAllAdv(){
		return dao.queryAllAdv();
	}
	
	public PageInfo<AdvertisementVo> queryAllAdvVo(Integer atid,Integer p,Integer s){
		PageHelper.startPage(p, s);
		return new PageInfo<AdvertisementVo>(dao.queryAllAdvVo(atid));
	}
	
	public PageInfo<NewsVo> queryAllNews(String userName,Integer p,Integer s){
		PageHelper.startPage(p, s);
		return new PageInfo<NewsVo>(dao.queryAllNews(userName));
	}
	
	public boolean removeAdv(String[] ids) {
		return dao.deleteAdv(ids)>0;
	}
}
