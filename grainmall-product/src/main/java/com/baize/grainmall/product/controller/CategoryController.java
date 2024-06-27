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
import com.baize.grainmall.product.dto.CategoryDTO;
import com.baize.grainmall.product.excel.CategoryExcel;
import com.baize.grainmall.product.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 商品三级分类
 *
 * @author baize junliuling363@gmail.com
 * @since 1.0.0 2024-06-22
 */
@RestController
@RequestMapping("product/category")
@Tag(name = "商品三级分类")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Value("${coupon.user.name}")
    private String name;
    @GetMapping("/test")
    public String test() {
        return name;
    }

    @GetMapping("/list/tree")
    @Operation(summary = "列表")
    public List<CategoryDTO> list() {
        List<CategoryDTO> entities = categoryService.listWithTree();
        return null;
    }

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
            @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref = "int"),
            @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY, required = true, ref = "int"),
            @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref = "String"),
            @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref = "String")
    })
    //@RequiresPermissions("product:category:page")
    public Result<PageData<CategoryDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params) {
        PageData<CategoryDTO> page = categoryService.page(params);

        return new Result<PageData<CategoryDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    // @RequiresPermissions("product:category:info")
    public Result<CategoryDTO> get(@PathVariable("id") Long id) {
        CategoryDTO data = categoryService.get(id);

        return new Result<CategoryDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
    // @RequiresPermissions("product:category:save")
    public Result save(@RequestBody CategoryDTO dto) {
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        categoryService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
    // @RequiresPermissions("product:category:update")
    public Result update(@RequestBody CategoryDTO dto) {
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        categoryService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
    // @RequiresPermissions("product:category:delete")
    public Result delete(@RequestBody Long[] ids) {
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        categoryService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
    // @RequiresPermissions("product:category:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<CategoryDTO> list = categoryService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "商品三级分类", list, CategoryExcel.class);
    }

}
