package com.wotrd.perscription.service;

import com.wotrd.perscription.pojo.Templatedetail;

import java.util.List;

public interface TemplateDetailService {
    /**
     * 处方详情
     * @return
     */
    List<Templatedetail> Templatedetail(Long tempateId);
}
