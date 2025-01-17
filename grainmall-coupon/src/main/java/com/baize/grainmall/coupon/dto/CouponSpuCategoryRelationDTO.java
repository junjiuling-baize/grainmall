package com.baize.grainmall.coupon.dto;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import java.io.Serializable;
import java.util.Date;


/**
 * 优惠券分类关联
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@Schema(name = "优惠券分类关联")
public class CouponSpuCategoryRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;




	@SchemaProperty(name = "优惠券id")
	private Long couponId;




	@SchemaProperty(name = "产品分类id")
	private Long categoryId;




	@SchemaProperty(name = "产品分类名称")
	private String categoryName;





}
