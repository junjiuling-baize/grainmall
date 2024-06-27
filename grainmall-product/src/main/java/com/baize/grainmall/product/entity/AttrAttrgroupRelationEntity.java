package com.baize.grainmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 属性&属性分组关联
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 属性id
     */
	private Long attrId;
    /**
     * 属性分组id
     */
	private Long attrGroupId;
    /**
     * 属性组内排序
     */
	private Integer attrSort;
}