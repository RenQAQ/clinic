package com.wotrd.data.controller;

import com.wotrd.data.pojo.Medicaladvice;
import com.wotrd.data.service.MedicaladviceService;
import io.swagger.annotations.ApiOperation;
import com.wotrd.pojo.utils.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medicaladvice")
public class MedicaladviceController {
    @Autowired
    MedicaladviceService medicaladviceService;
    @ApiOperation(value = "查询医嘱",notes = "查询全部医嘱信息")
    @GetMapping("/getmedicaladviceall")
    public RequesBean getMedicaladviceAll(){
        try {
            List<Medicaladvice> medicaladvices = medicaladviceService.getMedicaladviceAll();
            return RequesBean.ok(medicaladvices);
        } catch (Exception e) {
            e.printStackTrace();
            return RequesBean.error("系统异常",e);
        }
    }
}
