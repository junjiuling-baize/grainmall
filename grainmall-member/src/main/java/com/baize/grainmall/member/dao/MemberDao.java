package com.baize.grainmall.member.dao;

import com.baize.grainmall.common.dao.BaseDao;
import com.baize.grainmall.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Mapper
public interface MemberDao extends BaseDao<MemberEntity> {
	
}