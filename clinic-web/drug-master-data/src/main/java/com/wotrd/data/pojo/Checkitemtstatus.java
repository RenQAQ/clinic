package com.wotrd.data.pojo;


/**
 * @Description  
 * @Author  Henry
 * @Date 2020-04-15 
 */

public class Checkitemtstatus  {


	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/** 检查项目状态 */
	private String status;

}
