/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.baize.grainmall.common.service.impl;

import com.baize.grainmall.common.page.PageData;
import com.baize.grainmall.common.service.CrudService;
import com.baize.grainmall.common.utils.ConvertUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;

import org.springframework.beans.BeanUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *  CRUD基础服务类
 *
 * @author Mark sunlightcs@gmail.com
 */
public abstract class CrudServiceImpl<M extends BaseMapper<T>, T, D> extends BaseServiceImpl<M, T> implements CrudService<T, D> {

    protected Class<D> currentDtoClass() {
        return (Class<D>)ReflectionKit.getSuperClassGenericType(getClass(), CrudServiceImpl.class, 2);
    }

    @Override
    public PageData<D> page(Map<String, Object> params) {
        IPage<T> page = baseMapper.selectPage(
            getPage(params, null, false),
            getWrapper(params)
        );

        return getPageData(page, currentDtoClass());
    }

    @Override
    public List<D> list(Map<String, Object> params) {
        List<T> entityList = baseMapper.selectList(getWrapper(params));

        return ConvertUtils.sourceToTarget(entityList, currentDtoClass());
    }

    public abstract QueryWrapper<T> getWrapper(Map<String, Object> params);

    @Override
    public D get(Long id) {
        T entity = baseMapper.selectById(id);

        return ConvertUtils.sourceToTarget(entity, currentDtoClass());
    }

    @Override
    public void save(D dto) {
        T entity = ConvertUtils.sourceToTarget(dto, currentModelClass());
        insert(entity);

        //copy主键值到dto
        BeanUtils.copyProperties(entity, dto);
    }

    @Override
    public void update(D dto) {
        T entity = ConvertUtils.sourceToTarget(dto, currentModelClass());
        updateById(entity);
    }

    @Override
    public void delete(Long[] ids) {
        baseMapper.deleteBatchIds(Arrays.asList(ids));
    }
}