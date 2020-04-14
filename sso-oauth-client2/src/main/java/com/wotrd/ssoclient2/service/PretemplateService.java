package com.wotrd.ssoclient2.service;

import org.clinic.pojo.Pretemplate;
import org.clinic.pojo.utils.Conditionalquery;

import java.util.List;

public interface PretemplateService {

    List<Pretemplate> queryAllPretemplate(Conditionalquery conditionalquery);

    int pretemplateCount(Conditionalquery conditionalquery);
}
