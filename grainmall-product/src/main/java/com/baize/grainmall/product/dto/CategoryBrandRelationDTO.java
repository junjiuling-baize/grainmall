package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * 品牌分类关联
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "品牌分类关联")
public class CategoryBrandRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "")
	@ExcelProperty(value = "")
	private Long id;




	@SchemaProperty(name = "品牌id")
	@ExcelProperty(value = "品牌id")
	private Long brandId;




	@SchemaProperty(name = "分类id")
	@ExcelProperty(value = "分类id")
	private Long catelogId;




	@SchemaProperty(name = "")
	@ExcelProperty(value = "")
	private String brandName;




	@SchemaProperty(name = "")
	@ExcelProperty(value = "")
	private String catelogName;





}
