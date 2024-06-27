package com.baize.grainmall.product.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * 商品评价回复关系
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "商品评价回复关系")
public class CommentReplayDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	@ExcelProperty(value = "id")
	private Long id;




	@SchemaProperty(name = "评论id")
	@ExcelProperty(value = "评论id")
	private Long commentId;




	@SchemaProperty(name = "回复id")
	@ExcelProperty(value = "回复id")
	private Long replyId;





}
