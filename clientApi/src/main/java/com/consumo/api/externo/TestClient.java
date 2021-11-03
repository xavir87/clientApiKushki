package com.consumo.api.externo;

public class TestClient {

	public static void main(String[] args) throws ServiceException {

		KushkiClient client = new KushkiClient("https://api-uat.kushkipagos.com/subscriptions/", "v1");
		client.getSubscriptionToken();
		String subscripcionId= client.getSubscription(client.getSubscriptionToken().getToken()).getSubscriptionId();
		client.getCreatePreAuthorize(subscripcionId);
		String ticket="470410191179838172";
		client.getCapturePreAuthorize(subscripcionId, ticket);
		client.getSubscriptionInfo(subscripcionId);
		client = new KushkiClient("https://api-uat.kushkipagos.com/payouts/transfer/", "v1");
		client.getTransaction(ticket);
		client = new KushkiClient("https://api-uat.kushkipagos.com/analytics/", "v1");
		client.getTransactionList();
	}
}
