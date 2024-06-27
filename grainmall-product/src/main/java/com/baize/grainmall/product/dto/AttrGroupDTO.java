package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 属性分组
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "属性分组")
public class AttrGroupDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "分组id")
	@ExcelProperty(value = "分组id")
	private Long attrGroupId;




	@SchemaProperty(name = "组名")
	@ExcelProperty(value = "组名")
	private String attrGroupName;




	@SchemaProperty(name = "排序")
	@ExcelProperty(value = "排序")
	private Integer sort;




	@SchemaProperty(name = "描述")
	@ExcelProperty(value = "描述")
	private String descript;




	@SchemaProperty(name = "组图标")
	@ExcelProperty(value = "组图标")
	private String icon;




	@SchemaProperty(name = "所属分类id")
	@ExcelProperty(value = "所属分类id")
	private Long catelogId;





}
