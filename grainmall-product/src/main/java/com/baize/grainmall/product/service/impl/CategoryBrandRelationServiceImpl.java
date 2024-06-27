package com.baize.grainmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.product.dao.CategoryBrandRelationDao;
import com.baize.grainmall.product.dto.CategoryBrandRelationDTO;
import com.baize.grainmall.product.entity.CategoryBrandRelationEntity;
import com.baize.grainmall.product.service.CategoryBrandRelationService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class CategoryBrandRelationServiceImpl extends CrudServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity, CategoryBrandRelationDTO> implements CategoryBrandRelationService {

    @Override
    public QueryWrapper<CategoryBrandRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CategoryBrandRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}