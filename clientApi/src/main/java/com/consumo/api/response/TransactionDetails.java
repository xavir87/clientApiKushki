package com.consumo.api.response;

public class TransactionDetails {
    	private String acquirerBank;
    private String approvalCode;
    private String binCard;
    private String cardHolderName;
    private String cardType;
    private String isDeferred;
    private String lastFourDigitsOfCard;
    private String merchantName;
    private String processorBankName;
    private String processorName;
	public String getAcquirerBank() {
		return acquirerBank;
	}
	public void setAcquirerBank(String acquirerBank) {
		this.acquirerBank = acquirerBank;
	}
	public String getApprovalCode() {
		return approvalCode;
	}
	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}
	public String getBinCard() {
		return binCard;
	}
	public void setBinCard(String binCard) {
		this.binCard = binCard;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getIsDeferred() {
		return isDeferred;
	}
	public void setIsDeferred(String isDeferred) {
		this.isDeferred = isDeferred;
	}
	public String getLastFourDigitsOfCard() {
		return lastFourDigitsOfCard;
	}
	public void setLastFourDigitsOfCard(String lastFourDigitsOfCard) {
		this.lastFourDigitsOfCard = lastFourDigitsOfCard;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getProcessorBankName() {
		return processorBankName;
	}
	public void setProcessorBankName(String processorBankName) {
		this.processorBankName = processorBankName;
	}
	public String getProcessorName() {
		return processorName;
	}
	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}
        
}
