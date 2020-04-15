package com.wotrd.data.service;

import com.wotrd.data.dao.AdditionalfeesDao;
import com.wotrd.data.pojo.Additionalfees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdditionalfeesServiceImpl implements AdditionalfeesService{
    @Autowired
    AdditionalfeesDao additionalfeesDao;
    @Override
    public List<Additionalfees> getAdditionalfeesAll() {
        return additionalfeesDao.getAdditionalfeesAll();
    }
}
