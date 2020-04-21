package com.ruoyi.shiyan.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.shiyan.domain.TbSewagePlabt;
import com.ruoyi.shiyan.mapper.DrainageHouseholdMapper;
import com.ruoyi.shiyan.service.DrainageHouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DrainageHouseholdServiceImpl
 * @Description TODO
 * @Author zhangjian
 * @Date 2020/4/21 10:55
 **/
@Service
@DataSource(value = DataSourceType.SLAVE)
public class DrainageHouseholdServiceImpl implements DrainageHouseholdService {

    @Autowired
    private DrainageHouseholdMapper householdMapper;

    @Override
    public List<TbSewagePlabt> getStationAll() {
        return householdMapper.getStationAll();
    }
}
