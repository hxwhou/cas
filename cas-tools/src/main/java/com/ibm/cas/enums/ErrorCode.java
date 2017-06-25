package com.ibm.cas.enums;

public enum ErrorCode {
	
	SUCESS("L00", "Sucess"),
	
	DAO("ED0", "Data Access Error"),
	FILE("EF0", "File Access Error"),
	DYNAMIC_CACHE("EC0", "Dynamic Cache Error"),
	Authorization_API_ALL("EA0", "Authorization Failure"),
	Authorization_API_SPECIFIC("EA1", "Authorization Failure"),
	Authorization_DATA("EA2", "Authorization Failure"),
	Authorization_CREDENTIAL("EA3", "Credential Failure"),
	Validation_API("EV0", "API Validation Failure"),
	
	UNKNOWN("E99", "Undefined API Error");

	private final String code;
	private final String description;

	private ErrorCode(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "[" + code + "=" + description + "]";
	}
}
