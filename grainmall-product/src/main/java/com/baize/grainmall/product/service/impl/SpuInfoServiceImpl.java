package com.baize.grainmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.product.dao.SpuInfoDao;
import com.baize.grainmall.product.dto.SpuInfoDTO;
import com.baize.grainmall.product.entity.SpuInfoEntity;
import com.baize.grainmall.product.service.SpuInfoService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu信息
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class SpuInfoServiceImpl extends CrudServiceImpl<SpuInfoDao, SpuInfoEntity, SpuInfoDTO> implements SpuInfoService {

    @Override
    public QueryWrapper<SpuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}