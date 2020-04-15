package com.wotrd.data.controller;

import com.wotrd.data.pojo.Additionalfees;
import com.wotrd.data.service.AdditionalfeesService;
import io.swagger.annotations.ApiOperation;
import com.wotrd.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/additionalfees")
public class AdditionalfeesController {
    @Autowired
    AdditionalfeesService additionalfeesService;

    @GetMapping("/getadditionalfeesall")
    @ApiOperation(value = "调用附加费用api")
    public RequesBean getAdditionalfeesAll(){
        try {
            List<Additionalfees> additionalfees = additionalfeesService.getAdditionalfeesAll();
            return RequesBean.ok(additionalfees);
        } catch (Exception e) {
            e.printStackTrace();
            return RequesBean.error("系统异常",e);
        }
    }
}
