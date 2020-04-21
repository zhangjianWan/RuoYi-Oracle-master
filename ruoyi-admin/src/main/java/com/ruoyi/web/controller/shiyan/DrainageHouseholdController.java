package com.ruoyi.web.controller.shiyan;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.shiyan.domain.TbSewagePlabt;
import com.ruoyi.shiyan.service.DrainageHouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName DrainageHouseholdController
 * @Description TODO 排水户监管
 * @Author zhangjian
 * @Date 2020/4/20 14:47
 **/
@Controller
@RequestMapping("/household")
public class DrainageHouseholdController extends BaseController {

    @Autowired
    private DrainageHouseholdService householdService;

    @PostMapping("/getStationAll")
    @ResponseBody
    public TableDataInfo getStationAll() {

        List<TbSewagePlabt> stationAll = householdService.getStationAll();
        return getDataTable(stationAll);
    }
}
