package com.consumo.api.response;

public class Error {
	private String code;
	private String message;
	private String transactionReference;

	public Error() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Error(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public Error(String code, String message, String transactionReference) {
		this.code = code;
		this.message = message;
		this.transactionReference = transactionReference;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

}
