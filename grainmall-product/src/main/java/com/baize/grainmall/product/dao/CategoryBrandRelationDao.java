package com.baize.grainmall.product.dao;

import com.baize.grainmall.common.dao.BaseDao;
import com.baize.grainmall.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseDao<CategoryBrandRelationEntity> {
	
}