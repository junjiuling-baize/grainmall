package com.baize.grainmall.coupon.dao;

import com.baize.grainmall.common.dao.BaseDao;
import com.baize.grainmall.coupon.entity.CouponHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Mapper
public interface CouponHistoryDao extends BaseDao<CouponHistoryEntity> {
	
}