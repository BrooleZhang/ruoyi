package com.ruoyi.project.system.controller;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.domain.SysCar;
import com.ruoyi.project.system.domain.SysPost;
import com.ruoyi.project.system.service.ISysCarService;
import com.ruoyi.project.system.service.ISysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 车辆信息操作处理
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/car")
public class SysCarController extends BaseController
{
    @Autowired
    private ISysPostService postService;

    @Autowired
    private ISysCarService carService;

    /** 获取车辆列表 */
    @PreAuthorize("@ss.hasPermi('system:car:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCar car) {
        startPage();
        List<SysCar> list = carService.selectCarList(car);
        return getDataTable(list);
    }
    
//    @Log(title = "车辆管理", businessType = BusinessType.EXPORT)
//    @PreAuthorize("@ss.hasPermi('system:config:export')")
//    @GetMapping("/export")
//    public AjaxResult export(SysPost post)
//    {
//        List<SysPost> list = postService.selectPostList(post);
//        ExcelUtil<SysPost> util = new ExcelUtil<SysPost>(SysPost.class);
//        return util.exportExcel(list, "车辆数据");
//    }

    /**
     * 根据车辆编号获取详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:post:query')")
//    @GetMapping(value = "/{postId}")
//    public AjaxResult getInfo(@PathVariable Long postId)
//    {
//        return AjaxResult.success(postService.selectPostById(postId));
//    }

    /**
     * 新增车辆
     */
    @PreAuthorize("@ss.hasPermi('system:car:add')")
    @Log(title = "车辆管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysCar car)
    {
        if (UserConstants.NOT_UNIQUE.equals(carService.checkCarNameUnique(car)))
        {
            return AjaxResult.error("新增车辆'" + car.getCarName() + "'失败，车辆名称已存在");
        }
        else if (UserConstants.NOT_UNIQUE.equals(carService.checkCarCodeUnique(car)))
        {
            return AjaxResult.error("新增车辆'" + car.getCarName() + "'失败，车辆编码已存在");
        }
        car.setCreateBy(SecurityUtils.getUsername());
        return toAjax(carService.insertCar(car));
    }

    /**
     * 修改车辆
     */
//    @PreAuthorize("@ss.hasPermi('system:post:edit')")
//    @Log(title = "车辆管理", businessType = BusinessType.UPDATE)
//    @PutMapping
//    public AjaxResult edit(@Validated @RequestBody SysPost post)
//    {
//        if (UserConstants.NOT_UNIQUE.equals(postService.checkPostNameUnique(post)))
//        {
//            return AjaxResult.error("修改车辆'" + post.getPostName() + "'失败，车辆名称已存在");
//        }
//        else if (UserConstants.NOT_UNIQUE.equals(postService.checkPostCodeUnique(post)))
//        {
//            return AjaxResult.error("修改车辆'" + post.getPostName() + "'失败，车辆编码已存在");
//        }
//        post.setUpdateBy(SecurityUtils.getUsername());
//        return toAjax(postService.updatePost(post));
//    }

    /**
     * 删除车辆
     */
//    @PreAuthorize("@ss.hasPermi('system:post:remove')")
//    @Log(title = "车辆管理", businessType = BusinessType.DELETE)
//    @DeleteMapping("/{postIds}")
//    public AjaxResult remove(@PathVariable Long[] postIds)
//    {
//        return toAjax(postService.deletePostByIds(postIds));
//    }

    /**
     * 获取车辆选择框列表
     */
//    @GetMapping("/optionselect")
//    public AjaxResult optionselect()
//    {
//        List<SysPost> posts = postService.selectPostAll();
//        return AjaxResult.success(posts);
//    }
}
