package com.mitchma91.mitchManuel.Exception;

public class CustomeFieldValidationException extends Exception {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -5210038150681069683L;
	
private String fieldName;
	
	public CustomeFieldValidationException(String message, String fieldName) {
		super(message);
		this.fieldName = fieldName;
	}
	
	public String getFieldName() {
		return this.fieldName;
	}

}
