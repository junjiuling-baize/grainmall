package com.baize.grainmall.product.dao;

import com.baize.grainmall.common.dao.BaseDao;
import com.baize.grainmall.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Mapper
public interface CommentReplayDao extends BaseDao<CommentReplayEntity> {
	
}