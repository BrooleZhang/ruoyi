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
     * 查询所有岗位
     * 
     * @return 岗位列表
     */
//    public List<SysPost> selectPostAll();

    /**
     * 通过岗位ID查询岗位信息
     * 
     * @param postId 岗位ID
     * @return 角色对象信息
     */
//    public SysPost selectPostById(Long postId);

    /**
     * 根据用户ID获取岗位选择框列表
     * 
     * @param userId 用户ID
     * @return 选中岗位ID列表
     */
//    public List<Integer> selectPostListByUserId(Long userId);

    /**
     * 校验车辆名称
     * 
     * @param car 岗位信息
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
     * 通过岗位ID查询岗位使用数量
     * 
     * @param postId 岗位ID
     * @return 结果
     */
//    public int countUserPostById(Long postId);

    /**
     * 删除岗位信息
     * 
     * @param postId 岗位ID
     * @return 结果
     */
//    public int deletePostById(Long postId);

    /**
     * 批量删除岗位信息
     * 
     * @param postIds 需要删除的岗位ID
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
     * 修改保存岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
//    public int updatePost(SysPost post);
}
