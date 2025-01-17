package com.baize.grainmall.coupon.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * 优惠券分类关联
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
public class CouponSpuCategoryRelationExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "优惠券id")
    private Long couponId;
    @ExcelProperty(value = "产品分类id")
    private Long categoryId;
    @ExcelProperty(value = "产品分类名称")
    private String categoryName;

}