package com.baize.grainmall.member.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * 会员收藏的专题活动
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@Data
public class MemberCollectSubjectExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "subject_id")
    private Long subjectId;
    @ExcelProperty(value = "subject_name")
    private String subjectName;
    @ExcelProperty(value = "subject_img")
    private String subjectImg;
    @ExcelProperty(value = "活动url")
    private String subjectUrll;

}