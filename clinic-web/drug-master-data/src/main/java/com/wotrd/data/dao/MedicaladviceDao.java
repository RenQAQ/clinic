package com.wotrd.data.dao;

import com.wotrd.data.pojo.Medicaladvice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicaladviceDao {
    List<Medicaladvice> getMedicaladviceAll();
}
