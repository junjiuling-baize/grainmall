package com.baize.grainmall.product.service;

import com.baize.grainmall.common.service.CrudService;
import com.baize.grainmall.product.dao.CategoryDao;
import com.baize.grainmall.product.dto.CategoryBrandRelationDTO;
import com.baize.grainmall.product.dto.CategoryDTO;
import com.baize.grainmall.product.entity.CategoryBrandRelationEntity;
import com.baize.grainmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 商品三级分类
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
public interface CategoryService extends CrudService<CategoryEntity, CategoryDTO>  {

    List<CategoryDTO> listWithTree();

    void removeByIds(List<Integer> list);
}