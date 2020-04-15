package com.wotrd.data.dao;

import com.wotrd.data.pojo.Additionalfees;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdditionalfeesDao {
    List<Additionalfees> getAdditionalfeesAll();
}
