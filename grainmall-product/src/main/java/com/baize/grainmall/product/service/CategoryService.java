package com.baize.grainmall.product.service;

import com.baize.grainmall.common.service.CrudService;
import com.baize.grainmall.product.dto.CategoryDTO;
import com.baize.grainmall.product.entity.CategoryEntity;

import java.util.List;

/**
 * 商品三级分类
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
public interface CategoryService extends CrudService<CategoryEntity, CategoryDTO> {

    List<CategoryDTO> listWithTree();
}