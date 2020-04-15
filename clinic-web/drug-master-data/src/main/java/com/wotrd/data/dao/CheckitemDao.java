package com.wotrd.data.dao;

import com.wotrd.data.pojo.Checkitem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CheckitemDao {
    /**
     * 检查项目分页查询
     * @return
     */
    List<Checkitem> queryCheckitemParamPage(Map<String,Object> param);
}
