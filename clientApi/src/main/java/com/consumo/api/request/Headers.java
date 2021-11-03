package com.consumo.api.request;

public class Headers {
private String privateMerchantId;
private String publicMerchantId;
private String contentType;

public String getPrivateMerchantId() {
	return privateMerchantId;
}
public void setPrivateMerchantId(String privateMerchantId) {
	this.privateMerchantId = privateMerchantId;
}
public String getPublicMerchantId() {
	return publicMerchantId;
}
public void setPublicMerchantId(String publicMerchantId) {
	this.publicMerchantId = publicMerchantId;
}
public String getContentType() {
	return contentType;
}
public void setContentType(String contentType) {
	this.contentType = contentType;
}

}
