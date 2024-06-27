package com.baize.grainmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.coupon.dao.CouponHistoryDao;
import com.baize.grainmall.coupon.dto.CouponHistoryDTO;
import com.baize.grainmall.coupon.entity.CouponHistoryEntity;
import com.baize.grainmall.coupon.service.CouponHistoryService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class CouponHistoryServiceImpl extends CrudServiceImpl<CouponHistoryDao, CouponHistoryEntity, CouponHistoryDTO> implements CouponHistoryService {

    @Override
    public QueryWrapper<CouponHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CouponHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}