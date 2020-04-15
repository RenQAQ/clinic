package com.wotrd.ssoclient.controller;

import com.wotrd.ssoclient.util.HttpClientUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import com.wotrd.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 检查项目接口
 */
@Api(tags = "检查项目接口")
@RestController
public class CheckitemController {
    @Autowired
    HttpClientUtil httpClientUtil;

    private static final String DATA_LOCALHOST = "http://localhost:9007";

    @ApiOperation(value = "检查项目分页查询",notes = "分页查询检查项目")
    @ApiImplicitParams({
            @ApiImplicitParam( paramType = "query",name="pageIndex",value = "当前页数，必填",required = true,defaultValue = "1"),
            @ApiImplicitParam( paramType = "query",name ="checkitemtstatus",value = "项目状态，1启用，2禁用"),
            @ApiImplicitParam( paramType = "query",name = "checkitemnameORcheckitemno",value = "项目名称或项目编号")
    })
    @GetMapping("/call/querycheckitemparampage")
    public RequesBean queryStaffPage(@RequestParam(value = "pageIndex",defaultValue = "1")String pageIndex,
                                     String checkitemtstatus,String checkitemnameORcheckitemno){
        return httpClientUtil.get(DATA_LOCALHOST+"/checkitem/querycheckitemparampage?pageIndex="+pageIndex
                +"&checkitemtstatus="+checkitemtstatus+"&checkitemnameORcheckitemno="+checkitemnameORcheckitemno,RequesBean.class);
    }
}
