package com.ruoyi.project.system.service;

import java.util.List;
import com.ruoyi.project.system.domain.EquipmentName;

/**
 * 设备类别Service接口
 * 
 * @author ruoyi
 * @date 2020-04-08
 */
public interface IEquipmentNameService 
{
    /**
     * 查询设备类别
     * 
     * @param enId 设备类别ID
     * @return 设备类别
     */
    public EquipmentName selectEquipmentNameById(Long enId);

    /**
     * 查询设备类别列表
     * 
     * @param equipmentName 设备类别
     * @return 设备类别集合
     */
    public List<EquipmentName> selectEquipmentNameList(EquipmentName equipmentName);

    /**
     * 新增设备类别
     * 
     * @param equipmentName 设备类别
     * @return 结果
     */
    public int insertEquipmentName(EquipmentName equipmentName);

    /**
     * 修改设备类别
     * 
     * @param equipmentName 设备类别
     * @return 结果
     */
    public int updateEquipmentName(EquipmentName equipmentName);

    /**
     * 批量删除设备类别
     * 
     * @param enIds 需要删除的设备类别ID
     * @return 结果
     */
    public int deleteEquipmentNameByIds(Long[] enIds);

    /**
     * 删除设备类别信息
     * 
     * @param enId 设备类别ID
     * @return 结果
     */
    public int deleteEquipmentNameById(Long enId);
}
