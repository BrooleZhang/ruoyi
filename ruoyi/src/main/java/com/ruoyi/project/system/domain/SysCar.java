package com.ruoyi.project.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.aspectj.lang.annotation.Excel.ColumnType;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * 车辆信息表 sys_car
 * 
 */
public class SysCar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 车辆序号 */
    @Excel(name = "车辆序号", cellType = ColumnType.NUMERIC)
    private Long carId;

    /** 车辆编码 */
    @Excel(name = "车辆编码")
    private String carCode;

    /** 车辆名称 */
    @Excel(name = "车辆名称")
    private String carName;

    /** 车辆信息排序 */
    @Excel(name = "车辆排序")
    private String carSort;

    /** 车辆使用状态（0正在使用 1尚未使用 2停用） */
//    @Excel(name = "车辆状态", readConverterExp = "0=正常,1=停用")
    @Excel(name = "车辆状态", readConverterExp = "0=正在使用,1=尚未使用,2=停用")
    private String status;

    /** 购车时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "购车时间")
    private Date carCreateTime;

    /** 里程数 */
    @Excel(name = "里程数")
    private float mileages;

    /** 用户是否存在此车辆标识 默认不存在 */
    private boolean flag = false;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    @NotBlank(message = "车辆编码不能为空")
    @Size(min = 0, max = 64, message = "车辆编码长度不能超过64个字符")
    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    @NotBlank(message = "岗位名称不能为空")
    @Size(min = 0, max = 50, message = "岗位名称长度不能超过50个字符")
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @NotBlank(message = "显示顺序不能为空")
    public String getCarSort() {
        return carSort;
    }

    public void setCarSort(String carSort) {
        this.carSort = carSort;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public boolean isFlag()
    {
        return flag;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

    public Date getCarCreateTime() {
        return carCreateTime;
    }

    public void setCarCreateTime(Date carCreateTime) {
        this.carCreateTime = carCreateTime;
    }

    public float getMileages() {
        return mileages;
    }

    public void setMileages(float mileages) {
        this.mileages = mileages;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("carId", getCarId())
            .append("carCode", getCarCode())
            .append("carName", getCarName())
            .append("carSort", getCarSort())
            .append("status", getStatus())
            .append("carCreateTime", getCarCreateTime())
            .append("mileages", getMileages())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
