package com.baize.grainmall.product.controller;

import com.baize.grainmall.common.annotation.LogOperation;
import com.baize.grainmall.common.constant.Constant;
import com.baize.grainmall.common.page.PageData;
import com.baize.grainmall.common.utils.ExcelUtils;
import com.baize.grainmall.common.utils.Result;
import com.baize.grainmall.common.validator.AssertUtils;
import com.baize.grainmall.common.validator.ValidatorUtils;
import com.baize.grainmall.common.validator.group.AddGroup;
import com.baize.grainmall.common.validator.group.DefaultGroup;
import com.baize.grainmall.common.validator.group.UpdateGroup;
import com.baize.grainmall.product.dto.SkuSaleAttrValueDTO;
import com.baize.grainmall.product.excel.SkuSaleAttrValueExcel;
import com.baize.grainmall.product.service.SkuSaleAttrValueService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * sku销售属性&值
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@RestController
@RequestMapping("product/skusaleattrvalue")
@Tag(name="sku销售属性&值")
public class SkuSaleAttrValueController {
    @Autowired
    private SkuSaleAttrValueService skuSaleAttrValueService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
   //@RequiresPermissions("product:skusaleattrvalue:page")
    public Result<PageData<SkuSaleAttrValueDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<SkuSaleAttrValueDTO> page = skuSaleAttrValueService.page(params);

        return new Result<PageData<SkuSaleAttrValueDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
   // @RequiresPermissions("product:skusaleattrvalue:info")
    public Result<SkuSaleAttrValueDTO> get(@PathVariable("id") Long id){
        SkuSaleAttrValueDTO data = skuSaleAttrValueService.get(id);

        return new Result<SkuSaleAttrValueDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
   // @RequiresPermissions("product:skusaleattrvalue:save")
    public Result save(@RequestBody SkuSaleAttrValueDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        skuSaleAttrValueService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
   // @RequiresPermissions("product:skusaleattrvalue:update")
    public Result update(@RequestBody SkuSaleAttrValueDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        skuSaleAttrValueService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
   // @RequiresPermissions("product:skusaleattrvalue:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        skuSaleAttrValueService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
   // @RequiresPermissions("product:skusaleattrvalue:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SkuSaleAttrValueDTO> list = skuSaleAttrValueService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "sku销售属性&值", list, SkuSaleAttrValueExcel.class);
    }

}
