package com.wotrd.data.service;

import com.wotrd.data.dao.DiseasemessageDao;
import com.wotrd.data.pojo.Diseasemessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseasemessageServiceImpl implements DiseasemessageDao {
    @Autowired
    DiseasemessageDao diseasemessageDao;
    @Override
    public List<Diseasemessage> getDiseasemessageAll() {
        return diseasemessageDao.getDiseasemessageAll();
    }
}
