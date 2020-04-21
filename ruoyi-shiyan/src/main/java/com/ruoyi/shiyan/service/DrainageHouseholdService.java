package com.ruoyi.shiyan.service;

import com.ruoyi.shiyan.domain.TbSewagePlabt;

import java.util.List;

/**
 * @author zhangjian
 */
public interface DrainageHouseholdService {

    /**
     * 查询所以排水户信息
     *
     * @return List<TbSewagePlabt>
     */
    List<TbSewagePlabt> getStationAll();
}
