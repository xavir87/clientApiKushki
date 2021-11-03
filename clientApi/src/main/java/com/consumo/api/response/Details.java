package com.consumo.api.response;

import java.math.BigDecimal;

public class Details {

	/*
	 * private String approved_amount; private String processorError; private String
	 * processorMessage; private String processorName; private String response_code;
	 * private String response_text; private String ticket_number; private
	 * TransactionDetails transaction_details; private String transaction_id;
	 */
	private BigDecimal approvedTransactionAmount;
	private BigDecimal requestAmount;
	private String responseCode;
	private String approvalCode;
	private String syncMode;
	private String merchantId;
	private String processorId;
	private String cardHolderName;
	private String binCard;
	private String merchantName;
	private String processorName;
	private String processorBankName;
	private String transactionId;
	private String lastFourDigits;
	private BinInfo binInfo;
	private String paymentBrand;
	private int subtotalIva;
	private int subtotalIva0;
	private String currencyCode;
	private int ivaValue;
	private String cardCountry;
	private Integer created;
	private boolean fullResponse;
	private String transactionStatus;
	private String transactionType;
	//private String transactionReference;
	private String acquirerBank;

	public BigDecimal getApprovedTransactionAmount() {
		return approvedTransactionAmount;
	}

	public void setApprovedTransactionAmount(BigDecimal approvedTransactionAmount) {
		this.approvedTransactionAmount = approvedTransactionAmount;
	}

	public BigDecimal getRequestAmount() {
		return requestAmount;
	}

	public void setRequestAmount(BigDecimal requestAmount) {
		this.requestAmount = requestAmount;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public String getSyncMode() {
		return syncMode;
	}

	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getProcessorId() {
		return processorId;
	}

	public void setProcessorId(String processorId) {
		this.processorId = processorId;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getBinCard() {
		return binCard;
	}

	public void setBinCard(String binCard) {
		this.binCard = binCard;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public String getProcessorBankName() {
		return processorBankName;
	}

	public void setProcessorBankName(String processorBankName) {
		this.processorBankName = processorBankName;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getLastFourDigits() {
		return lastFourDigits;
	}

	public void setLastFourDigits(String lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}

	public BinInfo getBinInfo() {
		return binInfo;
	}

	public void setBinInfo(BinInfo binInfo) {
		this.binInfo = binInfo;
	}

	public String getPaymentBrand() {
		return paymentBrand;
	}

	public void setPaymentBrand(String paymentBrand) {
		this.paymentBrand = paymentBrand;
	}

	public int getSubtotalIva() {
		return subtotalIva;
	}

	public void setSubtotalIva(int subtotalIva) {
		this.subtotalIva = subtotalIva;
	}

	public int getSubtotalIva0() {
		return subtotalIva0;
	}

	public void setSubtotalIva0(int subtotalIva0) {
		this.subtotalIva0 = subtotalIva0;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public int getIvaValue() {
		return ivaValue;
	}

	public void setIvaValue(int ivaValue) {
		this.ivaValue = ivaValue;
	}

	public String getCardCountry() {
		return cardCountry;
	}

	public void setCardCountry(String cardCountry) {
		this.cardCountry = cardCountry;
	}

	public Integer getCreated() {
		return created;
	}

	public void setCreated(Integer created) {
		this.created = created;
	}

	public boolean isFullResponse() {
		return fullResponse;
	}

	public void setFullResponse(boolean fullResponse) {
		this.fullResponse = fullResponse;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

/*	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
*/
	public String getAcquirerBank() {
		return acquirerBank;
	}

	public void setAcquirerBank(String acquirerBank) {
		this.acquirerBank = acquirerBank;
	}

}
