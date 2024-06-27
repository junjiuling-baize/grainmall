package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * sku图片
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "sku图片")
public class SkuImagesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	@ExcelProperty(value = "id")
	private Long id;




	@SchemaProperty(name = "sku_id")
	@ExcelProperty(value = "sku_id")
	private Long skuId;




	@SchemaProperty(name = "图片地址")
	@ExcelProperty(value = "图片地址")
	private String imgUrl;




	@SchemaProperty(name = "排序")
	@ExcelProperty(value = "排序")
	private Integer imgSort;




	@SchemaProperty(name = "默认图[0 - 不是默认图，1 - 是默认图]")
	@ExcelProperty(value = "默认图[0 - 不是默认图，1 - 是默认图]")
	private Integer defaultImg;





}
