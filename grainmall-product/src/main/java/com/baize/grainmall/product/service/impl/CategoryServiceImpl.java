package com.baize.grainmall.product.service.impl;

import com.baize.grainmall.common.utils.ConvertUtils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.product.dao.CategoryDao;
import com.baize.grainmall.product.dto.CategoryDTO;
import com.baize.grainmall.product.entity.CategoryEntity;
import com.baize.grainmall.product.service.CategoryService;
import cn.hutool.core.util.StrUtil;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 商品三级分类
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class CategoryServiceImpl extends CrudServiceImpl<CategoryDao, CategoryEntity, CategoryDTO> implements CategoryService {


    @Override
    public List<CategoryDTO> listWithTree() {
//        1.查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //类型转换
        List<CategoryDTO> categoryDTO = ConvertUtils.sourceToTarget(categoryEntities, CategoryDTO.class);
//        3组装父子树形结构
        List<CategoryDTO> categoryDTOS = categoryDTO.stream().filter(categoryDto ->
                categoryDto.getParentCid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildrens(menu, categoryDTO));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());

        }).collect(Collectors.toList());

        return categoryDTOS;
    }

    private List<CategoryDTO> getChildrens(CategoryDTO root, List<CategoryDTO> all) {
        List<CategoryDTO> collect = all.stream().filter(categoryDTO -> {
                    return categoryDTO.getParentCid().equals(root.getCatId());
                }).map(
                        categoryDTO -> {
                            categoryDTO.setChildren(getChildrens(categoryDTO, all));
                            return categoryDTO;
                        }
                ).sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public void removeByIds(List<Integer> list) {
//        1.校验舒服被使用 TODO
//        2.删除
        baseMapper.deleteByIds(list);
    }


    @Override
    public QueryWrapper<CategoryEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<CategoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}