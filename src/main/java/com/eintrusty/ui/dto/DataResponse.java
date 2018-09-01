package com.eintrusty.ui.dto;

public class DataResponse {
	
	private String message;
	private Object dataResponse;
	public DataResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataResponse(String message, Object dataResponse) {
		super();
		this.message = message;
		this.dataResponse = dataResponse;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getDataResponse() {
		return dataResponse;
	}
	public void setDataResponse(Object dataResponse) {
		this.dataResponse = dataResponse;
	}
	
	

}
