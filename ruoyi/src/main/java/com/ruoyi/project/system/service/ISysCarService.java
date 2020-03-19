package com.ruoyi.project.system.service;

import com.ruoyi.project.system.domain.SysCar;
import com.ruoyi.project.system.domain.SysPost;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车辆信息 服务层
 * 
 */
public interface ISysCarService
{
    /**
     * 查询车辆信息集合
     * 
     * @param car 车辆信息
     * @return 车辆列表
     */
    public List<SysCar> selectCarList(SysCar car);

    /**
     * 查询所有车辆
     * 
     * @return 车辆列表
     */
//    public List<SysPost> selectPostAll();

    /**
     * 通过车辆ID查询车辆信息
     * 
     * @param carId 车辆ID
     * @return 角色对象信息
     */
    public SysCar selectCarById(Long carId);

    /**
     * 根据用户ID获取车辆选择框列表
     * 
     * @param userId 用户ID
     * @return 选中车辆ID列表
     */
//    public List<Integer> selectPostListByUserId(Long userId);

    /**
     * 校验车辆名称
     * 
     * @param car 车辆信息
     * @return 结果
     */
    public String checkCarNameUnique(SysCar car);

    /**
     * 校验车辆编码
     * 
     * @param car 车辆信息
     * @return 结果
     */
    public String checkCarCodeUnique(SysCar car);

    /**
     * 通过车辆ID查询车辆使用数量
     * 
     * @param postId 车辆ID
     * @return 结果
     */
//    public int countUserPostById(Long postId);

    /**
     * 删除车辆信息
     * 
     * @param postId 车辆ID
     * @return 结果
     */
//    public int deletePostById(Long postId);

    /**
     * 批量删除车辆信息
     * 
     * @param postIds 需要删除的车辆ID
     * @return 结果
     * @throws Exception 异常
     */
//    public int deletePostByIds(Long[] postIds);

    /**
     * 新增保存车辆信息
     * 
     * @param car 车辆信息
     * @return 结果
     */
    public int insertCar(SysCar car);

    /**
     * 修改保存车辆信息
     * 
     * @param car 车辆信息
     * @return 结果
     */
    public int updateCar(SysCar car);
}
