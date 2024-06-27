package com.baize.grainmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.coupon.dao.HomeSubjectSpuDao;
import com.baize.grainmall.coupon.dto.HomeSubjectSpuDTO;
import com.baize.grainmall.coupon.entity.HomeSubjectSpuEntity;
import com.baize.grainmall.coupon.service.HomeSubjectSpuService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 专题商品
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class HomeSubjectSpuServiceImpl extends CrudServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity, HomeSubjectSpuDTO> implements HomeSubjectSpuService {

    @Override
    public QueryWrapper<HomeSubjectSpuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<HomeSubjectSpuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}