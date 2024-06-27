package com.baize.grainmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.product.dao.SkuInfoDao;
import com.baize.grainmall.product.dto.SkuInfoDTO;
import com.baize.grainmall.product.entity.SkuInfoEntity;
import com.baize.grainmall.product.service.SkuInfoService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku信息
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class SkuInfoServiceImpl extends CrudServiceImpl<SkuInfoDao, SkuInfoEntity, SkuInfoDTO> implements SkuInfoService {

    @Override
    public QueryWrapper<SkuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}