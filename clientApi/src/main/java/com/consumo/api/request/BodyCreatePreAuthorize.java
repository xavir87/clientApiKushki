package com.consumo.api.request;

public class BodyCreatePreAuthorize {
	private Amount amount;
	private String name;
	private String lastname;
	private String email;
	private boolean fullResponse;

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isFullResponse() {
		return fullResponse;
	}

	public void setFullResponse(boolean fullResponse) {
		this.fullResponse = fullResponse;
	}

}
