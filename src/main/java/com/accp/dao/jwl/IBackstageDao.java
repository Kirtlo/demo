package com.accp.dao.jwl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.*;
import com.accp.vo.jwl.*;


public interface IBackstageDao {
		//国家地区管理
		/**
		 * 按父类编号查询地区
		 * @param pid
		 * @return
		 */
		public List<Sharea> queryAllArea(Integer pid);
		
		/**
		 * 获取当前选择父类地区
		 * @param id
		 * @return
		 */
		public Sharea queryById(Integer id);
		
		//广告位管理
		/**
		 * 获取所有广告位分类
		 * @return
		 */
		public List<Advertisementtype> queryAllAdv();
		
		/**
		 * 获取所有广告位
		 * @return
		 */
		public List<AdvertisementVo> queryAllAdvVo(@Param("atid") Integer atid);
		
		/**
		 * 广告批量删除
		 * @param ids
		 * @return
		 */
		public int deleteAdv(String[] ids);
		
		//站内信管理
		/**
		 * 查询所有站内消息
		 * @return
		 */
		public List<NewsVo> queryAllNews(@Param("userName")String userName);
}
