package com.consumo.api.response;

public class ResponseCreatePreAuthorize extends Error {
	
	private Details details;
	private String processorError;
	private String ticketNumber;
	private String transactionReference;
	
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getTransactionReference() {
		return transactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public String getProcessorError() {
		return processorError;
	}
	public void setProcessorError(String processorError) {
		this.processorError = processorError;
	}	
}
