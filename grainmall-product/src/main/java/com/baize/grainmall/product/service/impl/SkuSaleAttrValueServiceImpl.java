package com.baize.grainmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.product.dao.SkuSaleAttrValueDao;
import com.baize.grainmall.product.dto.SkuSaleAttrValueDTO;
import com.baize.grainmall.product.entity.SkuSaleAttrValueEntity;
import com.baize.grainmall.product.service.SkuSaleAttrValueService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class SkuSaleAttrValueServiceImpl extends CrudServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity, SkuSaleAttrValueDTO> implements SkuSaleAttrValueService {

    @Override
    public QueryWrapper<SkuSaleAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuSaleAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}