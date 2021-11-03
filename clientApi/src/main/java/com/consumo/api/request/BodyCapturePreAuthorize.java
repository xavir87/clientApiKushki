package com.consumo.api.request;

public class BodyCapturePreAuthorize {
	  private String ticketNumber;
	  private Amount amount;
	  private boolean fullResponse;
	  
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public boolean isFullResponse() {
		return fullResponse;
	}
	public void setFullResponse(boolean fullResponse) {
		this.fullResponse = fullResponse;
	}

}
