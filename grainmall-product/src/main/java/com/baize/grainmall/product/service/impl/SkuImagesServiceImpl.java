package com.baize.grainmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.product.dao.SkuImagesDao;
import com.baize.grainmall.product.dto.SkuImagesDTO;
import com.baize.grainmall.product.entity.SkuImagesEntity;
import com.baize.grainmall.product.service.SkuImagesService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku图片
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class SkuImagesServiceImpl extends CrudServiceImpl<SkuImagesDao, SkuImagesEntity, SkuImagesDTO> implements SkuImagesService {

    @Override
    public QueryWrapper<SkuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}