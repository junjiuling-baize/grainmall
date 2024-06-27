package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * sku销售属性&值
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "sku销售属性&值")
public class SkuSaleAttrValueDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	@ExcelProperty(value = "id")
	private Long id;




	@SchemaProperty(name = "sku_id")
	@ExcelProperty(value = "sku_id")
	private Long skuId;




	@SchemaProperty(name = "attr_id")
	@ExcelProperty(value = "attr_id")
	private Long attrId;




	@SchemaProperty(name = "销售属性名")
	@ExcelProperty(value = "销售属性名")
	private String attrName;




	@SchemaProperty(name = "销售属性值")
	@ExcelProperty(value = "销售属性值")
	private String attrValue;




	@SchemaProperty(name = "顺序")
	@ExcelProperty(value = "顺序")
	private Integer attrSort;





}
