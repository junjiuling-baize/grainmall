package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 品牌
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "品牌")
public class BrandDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "品牌id")
	@ExcelProperty(value = "品牌id")
	private Long brandId;




	@SchemaProperty(name = "品牌名")
	@ExcelProperty(value = "品牌名")
	private String name;




	@SchemaProperty(name = "品牌logo地址")
	@ExcelProperty(value = "品牌logo地址")
	private String logo;




	@SchemaProperty(name = "介绍")
	@ExcelProperty(value = "介绍")
	private String descript;




	@SchemaProperty(name = "显示状态[0-不显示；1-显示]")
	@ExcelProperty(value = "显示状态[0-不显示；1-显示]")
	private Integer showStatus;




	@SchemaProperty(name = "检索首字母")
	@ExcelProperty(value = "检索首字母")
	private String firstLetter;




	@SchemaProperty(name = "排序")
	@ExcelProperty(value = "排序")
	private Integer sort;





}
