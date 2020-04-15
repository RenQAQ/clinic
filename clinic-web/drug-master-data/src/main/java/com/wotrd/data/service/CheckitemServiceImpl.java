package com.wotrd.data.service;

import com.wotrd.data.dao.CheckitemDao;
import com.wotrd.data.pojo.Checkitem;
import com.wotrd.data.pojo.CheckitemParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CheckitemServiceImpl implements CheckitemService{
    @Autowired
    CheckitemDao checkitemDao;
    @Override
    public List<Checkitem> queryCheckitemParamPage(CheckitemParam checkitemParam) {
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("checkitemtstatus",checkitemParam.getCheckitemtstatus());
        param.put("checkitemnameORcheckitemno",checkitemParam.getCheckitemnameORcheckitemno());
        return checkitemDao.queryCheckitemParamPage(param);
    }
}
