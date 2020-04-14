package com.wotrd.ssoclient2.pretemplatecontroller;

import com.sun.org.apache.regexp.internal.RE;
import com.wotrd.ssoclient2.service.PretemplateService;
import org.clinic.pojo.utils.Conditionalquery;
import org.clinic.pojo.utils.Page;
import org.clinic.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pretemplate")
public class PretemplateController {
    @Autowired
    private PretemplateService pretemplateService;

    @GetMapping("/querypretemplate")
    public RequesBean queryAllPretemplate(String pageIndex,
                                          Conditionalquery conditionalquery){
        pageIndex = pageIndex==null?pageIndex="1":pageIndex;

        Page page = new Page();
        try {
            page.setPageSize(2);
            page.setCount(pretemplateService.pretemplateCount(conditionalquery));
            page.setPageIndex(Integer.parseInt(pageIndex));
            if(page.getPageIndex()<1){
                page.setPageIndex(1);
            }else if(page.getPageIndex()>page.getPageCount()){
                page.setPageIndex(page.getPageCount());
            }
            page.setFrom((page.getPageIndex()-1)*page.getPageSize());
            conditionalquery.setFrom(page.getFrom());
            conditionalquery.setPageSize(page.getPageSize());
            page.setList(pretemplateService.queryAllPretemplate(conditionalquery));
            return RequesBean.ok(page);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return RequesBean.error("系统异常",e);
        }
    }

}
