package com.wotrd.perscription.service;

import com.wotrd.perscription.pojo.TemapleParam;
import com.wotrd.perscription.pojo.Template;

import java.util.List;
import java.util.Map;

public interface TemplateService {

    List<Template> queryTemplatePage(TemapleParam temapleParam);
}
