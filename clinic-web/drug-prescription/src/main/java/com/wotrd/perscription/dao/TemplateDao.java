package com.wotrd.perscription.dao;

import com.wotrd.perscription.pojo.Template;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TemplateDao {
    List<Template> queryTemplatePage(Map<String,Object> param);

   // int temapleCount(Map<String,Object> param);
}
