package com.jspiders.springrest.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspiders.springrest.pojo.EmployeePOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse {

	private String status;
	private String msg;
	private EmployeePOJO data;
	private List<EmployeePOJO> list;
}
