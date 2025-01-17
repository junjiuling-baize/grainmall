package com.baize.grainmall.product.dao;

import com.baize.grainmall.common.dao.BaseDao;
import com.baize.grainmall.product.entity.BrandEntity;
import com.baize.grainmall.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Mapper
public interface BrandDao extends BaseDao<BrandEntity> {
    void update( BrandEntity Brand);


}