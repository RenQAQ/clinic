package com.wotrd.data.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wotrd.data.pojo.Checkitem;
import com.wotrd.data.pojo.CheckitemParam;
import com.wotrd.data.service.CheckitemService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import com.wotrd.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/checkitem")
public class CheckitemController {
    @Autowired
    CheckitemService checkitemService;

    @ApiOperation(value = "检查项目分页查询",notes = "分页查询检查项目")
    @ApiImplicitParams({
            @ApiImplicitParam( paramType = "query",name="pageIndex",value = "当前页数，必填",required = true,defaultValue = "1"),
            @ApiImplicitParam( paramType = "query",name ="checkitemtstatus",value = "项目状态，1启用，2禁用"),
            @ApiImplicitParam( paramType = "query",name = "checkitemnameORcheckitemno",value = "项目名称或项目编号")
    })
    @GetMapping("/querycheckitemparampage")
    public RequesBean queryCheckitemParamPage(@RequestParam(value = "pageIndex",defaultValue = "1")String pageIndex,
                                              CheckitemParam checkitemParam){
        try {
            PageHelper.startPage(Integer.parseInt(pageIndex),3);
            List<Checkitem> checkitems = checkitemService.queryCheckitemParamPage(checkitemParam);
            PageInfo<Checkitem> pageInfo = new PageInfo<Checkitem>(checkitems);
            return RequesBean.ok(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return RequesBean.error("系统异常",e);
        }
    }

}
