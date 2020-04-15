package com.wotrd.perscription.dao;

import com.wotrd.perscription.pojo.Template;
import com.wotrd.perscription.pojo.Templatedetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TemplateDetailDao {
    /**
     * 处方详情
     * @return
     */
    List<Templatedetail> Templatedetail(Long tempateId);
}
