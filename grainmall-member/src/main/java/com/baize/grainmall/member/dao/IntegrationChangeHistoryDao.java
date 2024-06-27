package com.baize.grainmall.member.dao;

import com.baize.grainmall.common.dao.BaseDao;
import com.baize.grainmall.member.entity.IntegrationChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseDao<IntegrationChangeHistoryEntity> {
	
}