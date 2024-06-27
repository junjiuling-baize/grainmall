package com.baize.grainmall.product.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * 商品评价回复关系
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
public class CommentReplayExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "评论id")
    private Long commentId;
    @ExcelProperty(value = "回复id")
    private Long replyId;

}