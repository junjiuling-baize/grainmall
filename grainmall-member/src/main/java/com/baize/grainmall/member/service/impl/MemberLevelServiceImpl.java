package com.baize.grainmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.member.dao.MemberLevelDao;
import com.baize.grainmall.member.dto.MemberLevelDTO;
import com.baize.grainmall.member.entity.MemberLevelEntity;
import com.baize.grainmall.member.service.MemberLevelService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员等级
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class MemberLevelServiceImpl extends CrudServiceImpl<MemberLevelDao, MemberLevelEntity, MemberLevelDTO> implements MemberLevelService {

    @Override
    public QueryWrapper<MemberLevelEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberLevelEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}