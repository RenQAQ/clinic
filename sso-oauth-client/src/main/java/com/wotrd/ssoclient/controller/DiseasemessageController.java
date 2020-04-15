package com.wotrd.ssoclient.controller;

import com.wotrd.ssoclient.util.HttpClientUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.wotrd.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 疾病查询接口
 */
@Api(tags = "疾病信息查询接口")
@RestController
public class DiseasemessageController {
    @Autowired
    HttpClientUtil httpClientUtil;

    private static final String DATA_LOCALHOST = "http://localhost:9007";
    @ApiOperation(value = "查询疾病",notes = "查询疾病全部信息")
    @GetMapping("/call/getdiseasemessageall")
    public RequesBean queryStaffPage(){
        return httpClientUtil.get(DATA_LOCALHOST+"/diseasemessagea/getdiseasemessageall",RequesBean.class);
    }
}
