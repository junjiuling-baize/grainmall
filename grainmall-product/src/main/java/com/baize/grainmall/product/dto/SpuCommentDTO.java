package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * 商品评价
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "商品评价")
public class SpuCommentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	@ExcelProperty(value = "id")
	private Long id;




	@SchemaProperty(name = "sku_id")
	@ExcelProperty(value = "sku_id")
	private Long skuId;




	@SchemaProperty(name = "spu_id")
	@ExcelProperty(value = "spu_id")
	private Long spuId;




	@SchemaProperty(name = "商品名字")
	@ExcelProperty(value = "商品名字")
	private String spuName;




	@SchemaProperty(name = "会员昵称")
	@ExcelProperty(value = "会员昵称")
	private String memberNickName;




	@SchemaProperty(name = "星级")
	@ExcelProperty(value = "星级")
	private Integer star;




	@SchemaProperty(name = "会员ip")
	@ExcelProperty(value = "会员ip")
	private String memberIp;




	@SchemaProperty(name = "创建时间")
	@ExcelProperty(value = "创建时间")
	private Date createTime;




	@SchemaProperty(name = "显示状态[0-不显示，1-显示]")
	@ExcelProperty(value = "显示状态[0-不显示，1-显示]")
	private Integer showStatus;




	@SchemaProperty(name = "购买时属性组合")
	@ExcelProperty(value = "购买时属性组合")
	private String spuAttributes;




	@SchemaProperty(name = "点赞数")
	@ExcelProperty(value = "点赞数")
	private Integer likesCount;




	@SchemaProperty(name = "回复数")
	@ExcelProperty(value = "回复数")
	private Integer replyCount;




	@SchemaProperty(name = "评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]")
	@ExcelProperty(value = "评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]")
	private String resources;




	@SchemaProperty(name = "内容")
	@ExcelProperty(value = "内容")
	private String content;




	@SchemaProperty(name = "用户头像")
	@ExcelProperty(value = "用户头像")
	private String memberIcon;




	@SchemaProperty(name = "评论类型[0 - 对商品的直接评论，1 - 对评论的回复]")
	@ExcelProperty(value = "评论类型[0 - 对商品的直接评论，1 - 对评论的回复]")
	private Integer commentType;





}
