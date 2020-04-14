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
public class Employee  {


	/** 序号 */
	private Long eid;

	/** 工号 */
	private Long emNo;

	/** 员工姓名 */
	private String emName;

	/** 员工性别 */
	private String gender;

	/** 员工年龄 */
	private Long age;

	/** 手机号码 */
	private String phone;

	/** 所属诊所 */
	private String eClinic;

	/** 所属科室 */
	private Long eSection;

	/** 角色 */
	private Long eRole;

	/** 创建时间 */
	private Date createTime;

	/** 创建人员 */
	private String createPerson;

	/** 状态，是否停用 */
	private Long status;

}
