package com.wotrd.data.pojo;

/**
 * @Description  
 * @Author  Henry
 * @Date 2020-04-14 
 */


public class Clinic  {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClinicname() {
		return clinicname;
	}

	public void setClinicname(String clinicname) {
		this.clinicname = clinicname;
	}

	private Long id;

	/** 诊所名称 */
	private String clinicname;

}
