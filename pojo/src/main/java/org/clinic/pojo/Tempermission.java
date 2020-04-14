package org.clinic.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description  
 * @Author  Henry
 * @Date 2020-04-12 
 */

@Data
@Setter
@Getter
public class Tempermission  {

	private Long id;

	/** 模板权限 */
	private String temPermission;

}
