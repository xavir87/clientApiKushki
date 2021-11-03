package com.consumo.api.externo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.consumo.api.response.Error;
import com.consumo.api.response.ResponseCreatePreAuthorize;
import com.consumo.api.response.ResponseSubscription;
import com.consumo.api.response.ResponseSubscriptionToken;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class KushkiClient extends AbstractClient {

	private static final Logger log = Logger.getLogger(KushkiClient.class.getName());

	public KushkiClient(String url, String contextPath) {
		super(url, contextPath);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("finally")
	public ResponseSubscriptionToken getSubscriptionToken() throws ServiceException {
		ResponseSubscriptionToken result = new ResponseSubscriptionToken();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			log.info("Ingreso a la peticion Subscription");
			WebTarget client = createClient(ApplicationEndpoint.getSubscriptionToken(""));
			Invocation.Builder invocationBuilder = client.request(MediaType.APPLICATION_JSON);
			Response response = SetMethod.apiSubscriptionToken(invocationBuilder, log);
			log.info("Cod Status Peticion:"+String.valueOf(response.getStatus()));
			if (Status.CREATED.getStatusCode() == response.getStatus()) {
				result = response.readEntity(ResponseSubscriptionToken.class);
			} else {
				// throw new ServiceException(response.readEntity(String.class), status);
				String responseData = response.readEntity(String.class);
				result = (ResponseSubscriptionToken) gson.fromJson(responseData, Error.class);
			}
		} catch (JsonProcessingException e) {
			result = (ResponseSubscriptionToken) new Error("400", e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			result = (ResponseSubscriptionToken) new Error("401", e.getMessage());
			e.getMessage();
		} finally {
			log.info("Codigo Resultado:"+result.getCode());
			log.info("Mensaje Resultado:"+result.getMessage());
			log.info("Token:"+result.getToken());
			return result;
		}
	}
	
	@SuppressWarnings("finally")
	public ResponseSubscription getSubscription(String token) throws ServiceException {
		ResponseSubscription result = new ResponseSubscription();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			log.info("Ingreso a la peticion Subscription");
			WebTarget client = createClient(ApplicationEndpoint.getSubscription(""));
			Invocation.Builder invocationBuilder = client.request(MediaType.APPLICATION_JSON);
			Response response = SetMethod.apiSubscription(token, invocationBuilder, log);
			log.info("Cod Status Peticion:"+String.valueOf(response.getStatus()));
			if (Status.CREATED.getStatusCode() == response.getStatus()) {
				result = response.readEntity(ResponseSubscription.class);
			} else {
				// throw new ServiceException(response.readEntity(String.class), status);
				String responseData = response.readEntity(String.class);
				result = (ResponseSubscription) gson.fromJson(responseData, Error.class);
			}
		} catch (JsonProcessingException e) {
			result = (ResponseSubscription) new Error("400", e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			result = (ResponseSubscription) new Error("401", e.getMessage());
			e.getMessage();
		} finally {
			log.info("Codigo Resultado:"+result.getCode());
			log.info("Mensaje Resultado:"+result.getMessage());
			log.info("SubscriptionId:"+result.getSubscriptionId());
			return result;
		}
	}
	
	@SuppressWarnings("finally")
	public ResponseCreatePreAuthorize getCreatePreAuthorize(String subscripcionId) throws ServiceException {
		ResponseCreatePreAuthorize result = new ResponseCreatePreAuthorize();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			log.info("***********************************************");
			log.info("***********************************************");
			log.info("Ingreso a la peticion Subscription");
			WebTarget client = createClient(ApplicationEndpoint.getCreatePreAuthorize(subscripcionId));
			Invocation.Builder invocationBuilder = client.request(MediaType.APPLICATION_JSON);
			Response response = SetMethod.apiCreatePreAuthorize(invocationBuilder, log);
			log.info("Cod Status Peticion:"+String.valueOf(response.getStatus()));
			if (Status.CREATED.getStatusCode() == response.getStatus()) {
			//	 result = response.readEntity(ResponseCreatePreAuthorize.class);
			//} else {
				// throw new ServiceException(response.readEntity(String.class), status);
				String responseData = response.readEntity(String.class);
				log.info("Respuesta:"+responseData);
				result = (ResponseCreatePreAuthorize) gson.fromJson(responseData, ResponseCreatePreAuthorize.class);
			}
		} catch (JsonProcessingException e) {
			result = (ResponseCreatePreAuthorize) new Error("400", e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			result = (ResponseCreatePreAuthorize) new Error("401", e.getCause().getMessage());
			e.getMessage();
		} finally {
			log.info("Codigo Resultado:"+result.getCode());
			log.info("Mensaje Resultado:"+result.getMessage());
			return result;
		}
	}
	
	@SuppressWarnings("finally")
	public Error getCapturePreAuthorize(String subscripcionId, String ticket) throws ServiceException {
		Error result = new Error();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			log.info("***********************************************");
			log.info("***********************************************");
			log.info("Ingreso a la peticion Subscription");
			WebTarget client = createClient(ApplicationEndpoint.getCapturePreAuthorize(subscripcionId));
			Invocation.Builder invocationBuilder = client.request(MediaType.APPLICATION_JSON);
			Response response = SetMethod.apiCapturePreAuthorize(invocationBuilder, log, ticket);
			log.info("Cod Status Peticion:"+String.valueOf(response.getStatus()));
			if (Status.CREATED.getStatusCode() == response.getStatus()) {
				result = response.readEntity(Error.class);
			} else {
				// throw new ServiceException(response.readEntity(String.class), status);
				String responseData = response.readEntity(String.class);
				log.info(responseData);
				result = gson.fromJson(responseData, Error.class);
			}
		} catch (JsonProcessingException e) {
			result = new Error("400", e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			result = new Error("401", e.getMessage());
			e.getMessage();
		} finally {
			log.info("Codigo Resultado:"+result.getCode());
			log.info("Mensaje Resultado:"+result.getMessage());
			log.info("Mensaje TransactionReference:"+result.getTransactionReference());
			return result;
		}
	}	
	
	@SuppressWarnings("finally")
	public Error getSubscriptionInfo(String subscripcionId) throws ServiceException {
		Error result = new Error();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			log.info("***********************************************");
			log.info("***********************************************");
			log.info("Ingreso a la peticion Subscription");
			WebTarget client = createClient(ApplicationEndpoint.getSubscriptionInfo(subscripcionId));
			Invocation.Builder invocationBuilder = client.request(MediaType.APPLICATION_JSON);
			Response response = SetMethod.apiSubscriptionInfo(invocationBuilder, log);
			log.info("Cod Status Peticion:"+String.valueOf(response.getStatus()));
			if (Status.OK.getStatusCode() == response.getStatus()) {
			//	result = response.readEntity(Error.class);
			//} else {
				// throw new ServiceException(response.readEntity(String.class), status);
				String responseData = response.readEntity(String.class);
				log.info(responseData);
				result = gson.fromJson(responseData, Error.class);
			}
		} catch (JsonProcessingException e) {
			result = new Error("400", e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			result = new Error("401", e.getMessage());
			e.getMessage();
		} finally {
			log.info("Codigo Resultado:"+result.getCode());
			log.info("Mensaje Resultado:"+result.getMessage());
			log.info("Mensaje TransactionReference:"+result.getTransactionReference());
			return result;
		}
	}	
	
	@SuppressWarnings("finally")
	public Error getTransaction(String ticket) throws ServiceException {
		Error result = new Error();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			log.info("***********************************************");
			log.info("***********************************************");
			log.info("Ingreso a la peticion Subscription");
			WebTarget client = createClient(ApplicationEndpoint.getTransaction(ticket));	
			Invocation.Builder invocationBuilder = client.request(MediaType.APPLICATION_JSON);
			Response response = SetMethod.apiTransaction(invocationBuilder, log);
			log.info("Cod Status Peticion:"+String.valueOf(response.getStatus()));
			if (Status.OK.getStatusCode() == response.getStatus()) {
				result = response.readEntity(Error.class);
			} else {
				// throw new ServiceException(response.readEntity(String.class), status);
				String responseData = response.readEntity(String.class);
				result = gson.fromJson(responseData, Error.class);
			}
		} catch (JsonProcessingException e) {
			result = new Error("400", e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			result = new Error("401", e.getMessage());
			e.getMessage();
		} finally {
			log.info("Codigo Resultado:"+result.getCode());
			log.info("Mensaje Resultado:"+result.getMessage());
			log.info("Mensaje TransactionReference:"+result.getTransactionReference());
			return result;
		}
	}	
	
	@SuppressWarnings("finally")
	public Error getTransactionList() throws ServiceException {
		Error result = new Error();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			log.info("***********************************************");
			log.info("***********************************************");
			log.info("Ingreso a la peticion Subscription");
			WebTarget client = createClient(ApplicationEndpoint.getTransactionList(""));
			
			/*client.queryParam("From", "2020-01-01T00:00:01");
			client.queryParam("To", "2020-01-05T00:00:01");
			*/
			Map<String, String> queryStrings=new HashMap<String, String>();
			queryStrings.put("from", "2020-01-01T00:00:01");
			queryStrings.put("to", "2020-11-05T00:00:01");
			for (String key: queryStrings.keySet()){		
			  	String value = queryStrings.get(key);
			  	client = client.queryParam(key, value);  //Es importante saber que el método queryParam no actualizará el objeto WebTarget actual, sino que devolverá uno nuevo. 
				}			
			log.info(client.toString());
			Invocation.Builder invocationBuilder = client.request(MediaType.APPLICATION_JSON_TYPE);
			Response response = SetMethod.apiTransactionList(invocationBuilder, log);
			log.info("Cod Status Peticion:"+String.valueOf(response.getStatus()));
			if (Status.OK.getStatusCode() == response.getStatus()) {
				String responseData = response.readEntity(String.class);
				log.info(responseData);
				result = response.readEntity(Error.class);
			} else {
				// throw new ServiceException(response.readEntity(String.class), status);
				String responseData = response.readEntity(String.class);
				result = gson.fromJson(responseData, Error.class);
			}
		} catch (JsonProcessingException e) {
			result = new Error("400", e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			result = new Error("401", e.getMessage());
			e.getMessage();
		} finally {
			log.info("Codigo Resultado:"+result.getCode());
			log.info("Mensaje Resultado:"+result.getMessage());
			log.info("Mensaje TransactionReference:"+result.getTransactionReference());
			return result;
		}
	}		


}
