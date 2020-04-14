package org.clinic.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

/**
 * @Description  
 * @Author  Henry
 * @Date 2020-04-12 
 */


@Setter
@Getter
public class Pretemplate  {

	/** 序号 */
	private Long id;

	/** 模板编号 */
	private String temNo;

	/** 模板名称 */
	private String temName;

	/** 处方类型 */
	private Long temType;

	/** 诊断 */
	private String temDiag;

	/** 模板权限 */
	private Long temPermission;

	/** 创建时间 */
	private Date createTime;

	/** 创建人员id */
	private Long createPerson;

	/** 描述 */
	private String description;

	/**
	 * 模板权限类
	 */
	private Tempermission tempermission;
	/**
	 * 模板类型类
	 */
	private Temtype temTypeObj;
	/**
	 * 员工类
	 */
	private Employee employee;

}
