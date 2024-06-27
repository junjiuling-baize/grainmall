package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * spu属性值
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "spu属性值")
public class ProductAttrValueDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	@ExcelProperty(value = "id")
	private Long id;




	@SchemaProperty(name = "商品id")
	@ExcelProperty(value = "商品id")
	private Long spuId;




	@SchemaProperty(name = "属性id")
	@ExcelProperty(value = "属性id")
	private Long attrId;




	@SchemaProperty(name = "属性名")
	@ExcelProperty(value = "属性名")
	private String attrName;




	@SchemaProperty(name = "属性值")
	@ExcelProperty(value = "属性值")
	private String attrValue;




	@SchemaProperty(name = "顺序")
	@ExcelProperty(value = "顺序")
	private Integer attrSort;




	@SchemaProperty(name = "快速展示【是否展示在介绍上；0-否 1-是】")
	@ExcelProperty(value = "快速展示【是否展示在介绍上；0-否 1-是】")
	private Integer quickShow;





}
