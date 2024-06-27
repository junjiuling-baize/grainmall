package com.baize.grainmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.coupon.dao.SkuLadderDao;
import com.baize.grainmall.coupon.dto.SkuLadderDTO;
import com.baize.grainmall.coupon.entity.SkuLadderEntity;
import com.baize.grainmall.coupon.service.SkuLadderService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class SkuLadderServiceImpl extends CrudServiceImpl<SkuLadderDao, SkuLadderEntity, SkuLadderDTO> implements SkuLadderService {

    @Override
    public QueryWrapper<SkuLadderEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuLadderEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}