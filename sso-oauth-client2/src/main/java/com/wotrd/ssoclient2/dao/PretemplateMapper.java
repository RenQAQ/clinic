package com.wotrd.ssoclient2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.clinic.pojo.Pretemplate;
import org.clinic.pojo.utils.Conditionalquery;

import java.util.List;


/**
 * 处方模板dao
 * @author 59693
 */
@Mapper
public interface PretemplateMapper {
    /**
     * 处方模板分页查询
     * @param conditionalquery
     * @return
     */
    List<Pretemplate> queryAllPretemplate(Conditionalquery conditionalquery);

    Integer pretemplateCont(Conditionalquery conditionalquery);
}
