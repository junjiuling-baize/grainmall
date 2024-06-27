package com.baize.grainmall.product.dto;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import java.io.Serializable;
import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
/**
 * 商品属性
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "商品属性")
public class AttrDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "属性id")
	@ExcelProperty(value = "属性id")
	private Long attrId;




	@SchemaProperty(name = "属性名")
	@ExcelProperty(value = "属性名")
	private String attrName;




	@SchemaProperty(name = "是否需要检索[0-不需要，1-需要]")
	@ExcelProperty(value = "是否需要检索[0-不需要，1-需要]")
	private Integer searchType;




	@SchemaProperty(name = "属性图标")
	@ExcelProperty(value = "属性图标")
	private String icon;




	@SchemaProperty(name = "可选值列表[用逗号分隔]")
	@ExcelProperty(value = "可选值列表[用逗号分隔]")
	private String valueSelect;




	@SchemaProperty(name = "属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]")
	@ExcelProperty(value = "属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]")
	private Integer attrType;




	@SchemaProperty(name = "启用状态[0 - 禁用，1 - 启用]")
	@ExcelProperty(value = "启用状态[0 - 禁用，1 - 启用]")
	private Long enable;




	@SchemaProperty(name = "所属分类")
	@ExcelProperty(value = "所属分类")
	private Long catelogId;




	@SchemaProperty(name = "快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整")
	@ExcelProperty(value = "快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整")
	private Integer showDesc;





}
