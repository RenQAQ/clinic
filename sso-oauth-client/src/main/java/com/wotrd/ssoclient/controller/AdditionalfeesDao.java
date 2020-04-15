package com.wotrd.ssoclient.controller;

import com.wotrd.ssoclient.util.HttpClientUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.wotrd.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 附加费用接口
 */
@Api(tags = "附加费用接口")
@RestController
public class AdditionalfeesDao {
    @Autowired
    HttpClientUtil httpClientUtil;

    private static final String DATA_LOCALHOST = "http://localhost:9007";
    @ApiOperation(value = "调用附加费用api")
    @GetMapping("/call/getadditionalfeesall")
    public RequesBean queryStaffPage(){
        return httpClientUtil.get(DATA_LOCALHOST+"/additionalfees/getadditionalfeesall",RequesBean.class);
    }
}
