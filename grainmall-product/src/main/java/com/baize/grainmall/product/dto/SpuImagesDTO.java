package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * spu图片
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "spu图片")
public class SpuImagesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	@ExcelProperty(value = "id")
	private Long id;




	@SchemaProperty(name = "spu_id")
	@ExcelProperty(value = "spu_id")
	private Long spuId;




	@SchemaProperty(name = "图片名")
	@ExcelProperty(value = "图片名")
	private String imgName;




	@SchemaProperty(name = "图片地址")
	@ExcelProperty(value = "图片地址")
	private String imgUrl;




	@SchemaProperty(name = "顺序")
	@ExcelProperty(value = "顺序")
	private Integer imgSort;




	@SchemaProperty(name = "是否默认图")
	@ExcelProperty(value = "是否默认图")
	private Integer defaultImg;





}
