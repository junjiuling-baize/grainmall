package com.baize.grainmall.coupon.dao;

import com.baize.grainmall.common.dao.BaseDao;
import com.baize.grainmall.coupon.entity.HomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Mapper
public interface HomeSubjectDao extends BaseDao<HomeSubjectEntity> {
	
}