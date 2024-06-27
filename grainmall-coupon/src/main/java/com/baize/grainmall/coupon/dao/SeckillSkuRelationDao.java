package com.baize.grainmall.coupon.dao;

import com.baize.grainmall.common.dao.BaseDao;
import com.baize.grainmall.coupon.entity.SeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseDao<SeckillSkuRelationEntity> {
	
}