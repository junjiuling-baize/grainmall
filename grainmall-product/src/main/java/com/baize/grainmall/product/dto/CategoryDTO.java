package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * 商品三级分类
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "商品三级分类")
public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "分类id")
	@ExcelProperty(value = "分类id")
	private Long catId;




	@SchemaProperty(name = "分类名称")
	@ExcelProperty(value = "分类名称")
	private String name;




	@SchemaProperty(name = "父分类id")
	@ExcelProperty(value = "父分类id")
	private Long parentCid;




	@SchemaProperty(name = "层级")
	@ExcelProperty(value = "层级")
	private Integer catLevel;




	@SchemaProperty(name = "是否显示[0-不显示，1显示]")
	@ExcelProperty(value = "是否显示[0-不显示，1显示]")
	private Integer showStatus;




	@SchemaProperty(name = "排序")
	@ExcelProperty(value = "排序")
	private Integer sort;




	@SchemaProperty(name = "图标地址")
	@ExcelProperty(value = "图标地址")
	private String icon;




	@SchemaProperty(name = "计量单位")
	@ExcelProperty(value = "计量单位")
	private String productUnit;




	@SchemaProperty(name = "商品数量")
	@ExcelProperty(value = "商品数量")
	private Integer productCount;





}
