package com.cold.modules.category.controller;


import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.cold.annotation.Pmap;
import com.cold.modules.category.entity.CategoryEntity;
import com.cold.modules.category.service.ICategoryService;
import com.cold.util.P;
import com.cold.util.R;
import com.cold.util.utli.AliyunOSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * <p>
 * 类目表 前端控制器
 * </p>
 *
 * @author 
 * @since 2021-07-24
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    ICategoryService categoryService;

    @RequestMapping("/list")
    public R list(){
        return categoryService.categoryList();
    }

    @RequestMapping("/del")
    public R del(@Pmap P p){
        Integer level = p.getInt("level");
        if (level == 1) {
            //根据查询条件做批量删除
            Integer categoryId = p.getInt("categoryId");
            UpdateWrapper<CategoryEntity> updateWrapper = new UpdateWrapper<>();
            updateWrapper.eq("pid",categoryId).or().eq("category_id",categoryId);
            categoryService.remove(updateWrapper);
            return R.success("批量删除成功！");
        }else{
            categoryService.removeById(p.getInt("categoryId"));
            return R.success("删除成功！");
        }
    }

    @RequestMapping("/add")
    public R add(@Pmap P p) throws Exception {
        CategoryEntity categoryEntity = p.thisToEntity(CategoryEntity.class);
        categoryEntity.setAddTime(new Date());
        categoryService.save(categoryEntity);
        return R.success();
    }

    @RequestMapping("/upload")
    public R upload(@RequestParam MultipartFile file) throws Exception {
        String s = AliyunOSSUtil.uploadShopGoodsImg(file);
        return R.success().set("filePath",s);
    }

}
