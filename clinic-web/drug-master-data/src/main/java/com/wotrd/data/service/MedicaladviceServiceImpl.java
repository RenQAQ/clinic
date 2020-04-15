package com.wotrd.data.service;

import com.wotrd.data.dao.MedicaladviceDao;
import com.wotrd.data.pojo.Medicaladvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicaladviceServiceImpl implements MedicaladviceService{
    @Autowired
    MedicaladviceDao medicaladviceDao;
    @Override
    public List<Medicaladvice> getMedicaladviceAll() {
        return medicaladviceDao.getMedicaladviceAll();
    }
}
