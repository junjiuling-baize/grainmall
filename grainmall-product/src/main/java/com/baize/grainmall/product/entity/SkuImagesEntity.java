package com.baize.grainmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * sku图片
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity {

    /**
     * id
     */
    @TableId(value="id")
	private Long id;
    /**
     * sku_id
     */
	private Long skuId;
    /**
     * 图片地址
     */
	private String imgUrl;
    /**
     * 排序
     */
	private Integer imgSort;
    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
	private Integer defaultImg;
}