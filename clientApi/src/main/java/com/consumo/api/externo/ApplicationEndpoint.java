package com.consumo.api.externo;

public class ApplicationEndpoint {
	private static String CARD = "/card";
	private static String TOKEN = "/tokens";
	private static String AUTHORIZE = "/authorize";
	private static String CAPTURE = "/capture";
	private static String SEARCH = "/search";
	private static String TRANSACTION = "/transaction";
	private static String TRANSACTIONLIST = "/transactions-list";
	
	public static String getSubscriptionToken(String parametro) {
		return CARD.concat(String.format("%s", parametro).concat(TOKEN));
	}

	public static String getSubscription(String parametro) {
		return CARD.concat(String.format("%s", parametro));
	}
	
	public static String getCreatePreAuthorize(String parametro) {
		return CARD.concat("/").concat(String.format("%s", parametro).concat(AUTHORIZE));
	}
	
	public static String getCapturePreAuthorize(String parametro) {
		return CARD.concat("/").concat(String.format("%s", parametro).concat(CAPTURE));
	}	
	
	public static String getSubscriptionInfo(String parametro) {
		return CARD.concat(SEARCH).concat("/").concat(String.format("%s", parametro));
	}	
	
	public static String getTransactionList(String parametro) {
		return TRANSACTIONLIST.concat(String.format("%s", parametro));
	}		
	
	public static String getTransaction(String parametro) {
		return TRANSACTION.concat("/").concat(String.format("%s", parametro));
	}
}
