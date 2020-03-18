package com.ruoyi.project.system.service.impl;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.exception.CustomException;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.system.domain.SysCar;
import com.ruoyi.project.system.domain.SysPost;
import com.ruoyi.project.system.mapper.SysCarMapper;
import com.ruoyi.project.system.mapper.SysPostMapper;
import com.ruoyi.project.system.mapper.SysUserPostMapper;
import com.ruoyi.project.system.service.ISysCarService;
import com.ruoyi.project.system.service.ISysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车辆信息 服务层处理
 * 
 */
@Service
public class SysCarServiceImpl implements ISysCarService
{
    @Autowired
    private SysPostMapper postMapper;

    @Autowired
    private SysUserPostMapper userPostMapper;

    @Autowired
    private SysCarMapper sysCarMapper;

    /**
     * 查询车辆信息集合
     * 
     * @param car 车辆信息
     * @return 车辆信息集合
     */
    @Override
    public List<SysCar> selectCarList(SysCar car)
    {
        return sysCarMapper.selectCarList(car);
    }

    /**
     * 查询所有车辆
     * 
     * @return 车辆列表
     */
//    @Override
//    public List<SysPost> selectPostAll()
//    {
//        return postMapper.selectPostAll();
//    }

    /**
     * 通过车辆ID查询车辆信息
     * 
     * @param postId 车辆ID
     * @return 角色对象信息
     */
//    @Override
//    public SysPost selectPostById(Long postId)
//    {
//        return postMapper.selectPostById(postId);
//    }

    /**
     * 根据用户ID获取车辆选择框列表
     * 
     * @param userId 用户ID
     * @return 选中车辆ID列表
     */
//    public List<Integer> selectPostListByUserId(Long userId)
//    {
//        return postMapper.selectPostListByUserId(userId);
//    }

    /**
     * 校验车辆名称是否唯一
     * 
     * @param car 车辆信息
     * @return 结果
     */
    @Override
    public String checkCarNameUnique(SysCar car)
    {
        Long carId = StringUtils.isNull(car.getCarId()) ? -1L : car.getCarId();
        SysCar info = sysCarMapper.checkCarNameUnique(car.getCarName());

        if (StringUtils.isNotNull(info) && info.getCarId().longValue() != carId.longValue())
        {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 校验车辆编码是否唯一
     * 
     * @param car 车辆信息
     * @return 结果
     */
    @Override
    public String checkCarCodeUnique(SysCar car)
    {
        Long carId = StringUtils.isNull(car.getCarId()) ? -1L : car.getCarId();
        SysCar info = sysCarMapper.checkCarCodeUnique(car.getCarCode());
        if (StringUtils.isNotNull(info) && info.getCarId().longValue() != carId.longValue())
        {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 通过车辆ID查询车辆使用数量
     * 
     * @param postId 车辆ID
     * @return 结果
     */
//    @Override
//    public int countUserPostById(Long postId)
//    {
//        return userPostMapper.countUserPostById(postId);
//    }

    /**
     * 删除车辆信息
     * 
     * @param postId 车辆ID
     * @return 结果
     */
//    @Override
//    public int deletePostById(Long postId)
//    {
//        return postMapper.deletePostById(postId);
//    }

    /**
     * 批量删除车辆信息
     * 
     * @param postIds 需要删除的车辆ID
     * @return 结果
     * @throws Exception 异常
     */
//    public int deletePostByIds(Long[] postIds)
//    {
//        for (Long postId : postIds)
//        {
//            SysPost post = selectPostById(postId);
//            if (countUserPostById(postId) > 0)
//            {
//                throw new CustomException(String.format("%1$s已分配,不能删除", post.getPostName()));
//            }
//        }
//        return postMapper.deletePostByIds(postIds);
//    }

    /**
     * 新增保存车辆信息
     * 
     * @param car 车辆信息
     * @return 结果
     */
    @Override
    public int insertCar(SysCar car)
    {
        return sysCarMapper.insertCar(car);
    }

    /**
     * 修改保存车辆信息
     * 
     * @param post 车辆信息
     * @return 结果
     */
//    @Override
//    public int updatePost(SysPost post)
//    {
//        return postMapper.updatePost(post);
//    }
}
