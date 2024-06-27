package com.baize.grainmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.member.dao.GrowthChangeHistoryDao;
import com.baize.grainmall.member.dto.GrowthChangeHistoryDTO;
import com.baize.grainmall.member.entity.GrowthChangeHistoryEntity;
import com.baize.grainmall.member.service.GrowthChangeHistoryService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class GrowthChangeHistoryServiceImpl extends CrudServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity, GrowthChangeHistoryDTO> implements GrowthChangeHistoryService {

    @Override
    public QueryWrapper<GrowthChangeHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<GrowthChangeHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}