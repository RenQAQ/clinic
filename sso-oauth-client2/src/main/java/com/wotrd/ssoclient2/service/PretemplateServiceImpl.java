package com.wotrd.ssoclient2.service;

import com.wotrd.ssoclient2.dao.PretemplateMapper;
import org.clinic.pojo.Pretemplate;
import org.clinic.pojo.utils.Conditionalquery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PretemplateServiceImpl implements PretemplateService{
    @Autowired
    PretemplateMapper pretemplateMapper;
    @Override
    public List<Pretemplate> queryAllPretemplate(Conditionalquery conditionalquery) {
        return pretemplateMapper.queryAllPretemplate(conditionalquery);
    }

    @Override
    public int pretemplateCount(Conditionalquery conditionalquery) {
        return pretemplateMapper.pretemplateCont(conditionalquery);
    }
}
