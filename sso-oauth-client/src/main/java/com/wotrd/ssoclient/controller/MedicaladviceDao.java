package com.wotrd.ssoclient.controller;

import com.wotrd.ssoclient.util.HttpClientUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.wotrd.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 医嘱查询接口
 */
@Api(tags = "医嘱查询接口")
@RestController
public class MedicaladviceDao {
    @Autowired
    HttpClientUtil httpClientUtil;

    private static final String DATA_LOCALHOST = "http://localhost:9007";

    @ApiOperation(value = "查询医嘱",notes = "查询全部医嘱信息")
    @GetMapping("/call/getmedicaladviceall")
    public RequesBean queryStaffPage(){
        return httpClientUtil.get(DATA_LOCALHOST+"/medicaladvice/getmedicaladviceall",RequesBean.class);
    }
}
