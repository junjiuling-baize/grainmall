package com.baize.grainmall.product.dto;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import java.io.Serializable;
import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
/**
 * 属性&属性分组关联
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "属性&属性分组关联")
public class AttrAttrgroupRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	@ExcelProperty(value = "id")
	private Long id;




	@SchemaProperty(name = "属性id")
	@ExcelProperty(value = "属性id")
	private Long attrId;




	@SchemaProperty(name = "属性分组id")
	@ExcelProperty(value = "属性分组id")
	private Long attrGroupId;




	@SchemaProperty(name = "属性组内排序")
	@ExcelProperty(value = "属性组内排序")
	private Integer attrSort;





}
