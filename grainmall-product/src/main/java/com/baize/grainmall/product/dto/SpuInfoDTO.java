package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * spu信息
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "spu信息")
public class SpuInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "商品id")
	@ExcelProperty(value = "商品id")
	private Long id;




	@SchemaProperty(name = "商品名称")
	@ExcelProperty(value = "商品名称")
	private String spuName;




	@SchemaProperty(name = "商品描述")
	@ExcelProperty(value = "商品描述")
	private String spuDescription;




	@SchemaProperty(name = "所属分类id")
	@ExcelProperty(value = "所属分类id")
	private Long catalogId;




	@SchemaProperty(name = "品牌id")
	@ExcelProperty(value = "品牌id")
	private Long brandId;




	@SchemaProperty(name = "")
	@ExcelProperty(value = "")
	private BigDecimal weight;




	@SchemaProperty(name = "上架状态[0 - 下架，1 - 上架]")
	@ExcelProperty(value = "上架状态[0 - 下架，1 - 上架]")
	private Integer publishStatus;




	@SchemaProperty(name = "")
	@ExcelProperty(value = "")
	private Date createTime;




	@SchemaProperty(name = "")
	@ExcelProperty(value = "")
	private Date updateTime;





}
