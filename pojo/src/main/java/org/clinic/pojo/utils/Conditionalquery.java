package org.clinic.pojo.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * 条件查询
 * @author 59693
 */
@Setter
@Getter
public class Conditionalquery {
    private Integer from;

    private Integer pageSize;
    /**
     * 处方类别
     */
    private String temType;
    /**
     * 模板权限
     */
    private String temPermission;
    /**
     * 模板名称/模板编码
     */
    private String temNameORtemId;
}
