package com.wotrd.data.dao;

import com.wotrd.data.pojo.Diseasemessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiseasemessageDao {
    List<Diseasemessage> getDiseasemessageAll();
}
