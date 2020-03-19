package com.ruoyi.project.system.mapper;

import com.ruoyi.project.system.domain.SysCar;
import com.ruoyi.project.system.domain.SysPost;

import java.util.List;

/**
 * 车辆信息 数据层
 * 
 */
public interface SysCarMapper
{
    /**
     * 查询车辆数据集合
     * 
     * @param car 车辆信息
     * @return 车辆数据集合
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
     * 查询用户所属车辆组
     * 
     * @param userName 用户名
     * @return 结果
     */
//    public List<SysPost> selectPostsByUserName(String userName);

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
     */
//    public int deletePostByIds(Long[] postIds);

    /**
     * 修改车辆信息
     * 
     * @param car 车辆信息
     * @return 结果
     */
    public int updateCar(SysCar car);

    /**
     * 新增车辆信息
     * 
     * @param car 车辆信息
     * @return 结果
     */
    public int insertCar(SysCar car);

    /**
     * 校验车辆名称
     * 
     * @param carName 车辆名称
     * @return 结果
     */
    public SysCar checkCarNameUnique(String carName);

    /**
     * 校验车辆编码
     * 
     * @param carCode 车辆编码
     * @return 结果
     */
    public SysCar checkCarCodeUnique(String carCode);
}
