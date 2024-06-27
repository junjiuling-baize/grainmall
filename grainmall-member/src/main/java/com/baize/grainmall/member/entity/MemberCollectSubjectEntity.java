package com.baize.grainmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 会员收藏的专题活动
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity {

    /**
     * id
     */
	private Long id;
    /**
     * subject_id
     */
	private Long subjectId;
    /**
     * subject_name
     */
	private String subjectName;
    /**
     * subject_img
     */
	private String subjectImg;
    /**
     * 活动url
     */
	private String subjectUrll;
}