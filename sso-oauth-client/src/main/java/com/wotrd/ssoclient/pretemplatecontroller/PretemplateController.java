package com.wotrd.ssoclient.pretemplatecontroller;

import com.wotrd.ssoclient.util.HttpClientUtil;
import org.clinic.pojo.utils.Conditionalquery;
import org.clinic.pojo.utils.Page;
import org.clinic.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PretemplateController {
    @Autowired
    private HttpClientUtil httpClientUtil;

    private static final String CLIENT2_URL = "http://localhost:9006";

    @GetMapping("/call/querypretemplate")
    public RequesBean queryAllPretemplate(String pageIndex,
                                          Conditionalquery conditionalquery){
            return httpClientUtil.get(CLIENT2_URL+"/pretemplate/querypretemplate?pageIndex="+
                    pageIndex+"&temType="+conditionalquery.getTemType()+"&temPermission="+conditionalquery.getTemPermission()+
                    "&temNameORtemId="+conditionalquery.getTemNameORtemId(),RequesBean.class);
    }

}
