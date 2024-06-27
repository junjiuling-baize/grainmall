package com.baize.grainmall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baize.grainmall.common.service.impl.CrudServiceImpl;
import com.baize.grainmall.member.dao.MemberCollectSubjectDao;
import com.baize.grainmall.member.dto.MemberCollectSubjectDTO;
import com.baize.grainmall.member.entity.MemberCollectSubjectEntity;
import com.baize.grainmall.member.service.MemberCollectSubjectService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Service
public class MemberCollectSubjectServiceImpl extends CrudServiceImpl<MemberCollectSubjectDao, MemberCollectSubjectEntity, MemberCollectSubjectDTO> implements MemberCollectSubjectService {

    @Override
    public QueryWrapper<MemberCollectSubjectEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberCollectSubjectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}