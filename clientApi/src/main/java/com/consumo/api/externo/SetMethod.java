package com.consumo.api.externo;

import java.util.Map;
import java.util.logging.Logger;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import com.consumo.api.request.Amount;
import com.consumo.api.request.BodyCapturePreAuthorize;
import com.consumo.api.request.BodyCard;
import com.consumo.api.request.BodyCreatePreAuthorize;
import com.consumo.api.request.BodySubscriptionToken;
import com.consumo.api.request.Card;
import com.consumo.api.request.ContactDetails;
import com.consumo.api.request.Fitness;
import com.consumo.api.request.Metadata;
import com.consumo.api.request.Plan;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SetMethod {

	private static String PRIVATEMERCHANTID = "Private-Merchant-Id";
	private static String PUBLICMERCHANTID = "Public-Merchant-Id";
	private static String KEYPRIVATEMERCHANTID = "fa37c9fa0ab84804a8a96b0a098ad790";
	private static String KEYPUBLICMERCHANTID = "965e729b4a674b9590a119522ffc7ceb";
	
	public static Response apiSubscriptionToken(Invocation.Builder builder, Logger log) throws JsonProcessingException {
		Response response = null;
		ObjectMapper mapper = new ObjectMapper();
		String json = null;

		builder.header(PUBLICMERCHANTID, KEYPUBLICMERCHANTID);
		BodySubscriptionToken objectBody = new BodySubscriptionToken();
		Card objectCard = new Card();
		objectCard.setCvv("085");
		objectCard.setExpiryMonth("03");
		objectCard.setExpiryYear("23");
		objectCard.setName("MICOMERCIO");
		objectCard.setNumber("4242424242424242");
		objectBody.setCard(objectCard);
		objectBody.setCurrency("USD");

		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectBody);
		log.info(json);
		response = builder.post(Entity.json(json));

		return response;
	}
	
	public static Response apiSubscription(String token, Invocation.Builder builder, Logger log) throws JsonProcessingException {
		Response response = null;
		ObjectMapper mapper = new ObjectMapper();
		String json = null;

		builder.header(PRIVATEMERCHANTID, KEYPRIVATEMERCHANTID);
		BodyCard objectBody = new BodyCard();
		objectBody.setPeriodicity("monthly");
		objectBody.setPlanName("Premium");
		objectBody.setStartDate("2018-09-25");
		objectBody.setToken(token);
		Amount objectAmount = new Amount();
		objectAmount.setCurrency("USD");
		objectAmount.setIce(0);
		objectAmount.setIva(0.14);
		objectAmount.setSubtotalIva(1);
		objectAmount.setSubtotalIva0(0);
		objectBody.setAmount(objectAmount);
		ContactDetails objectContactDetails = new ContactDetails();
		objectContactDetails.setDocumentNumber("0925281743");
		objectContactDetails.setDocumentType("CI");
		objectContactDetails.setEmail("pedro.villafuerte@gmail.com");
		objectContactDetails.setFirstName("Pedro");
		objectContactDetails.setLastName("Villafuerte");
		objectContactDetails.setPhoneNumber("+593967350943");
		objectBody.setContactDetails(objectContactDetails);
		Metadata objectMetadata = new Metadata();
		Fitness objectFitness = new Fitness();
		Plan objectPlan = new Plan();
		objectFitness.setCardio("include");
		objectFitness.setPool("include");
		objectFitness.setRumba("include");
		objectPlan.setFitness(objectFitness);
		objectMetadata.setPlan(objectPlan);
		objectBody.setMetadata(objectMetadata);

		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectBody);
		log.info(json);
		response = builder.post(Entity.json(json));

		return response;
	}

	public static Response apiCreatePreAuthorize(Invocation.Builder builder, Logger log) throws JsonProcessingException {
		Response response = null;
		ObjectMapper mapper = new ObjectMapper();
		String json = null;

		builder.header(PRIVATEMERCHANTID, KEYPRIVATEMERCHANTID);
		//builder.header("subscriptionId", "comercialpxv");
		BodyCreatePreAuthorize objectBody = new BodyCreatePreAuthorize();
		objectBody.setEmail("pedro.villafuerte@gmail.com");
		objectBody.setFullResponse(true);
		objectBody.setLastname("Pedro Villafuerte");
		objectBody.setName("Pedro");
		Amount objectAmount = new Amount();
		objectAmount.setCurrency("USD");
		objectAmount.setIce(0);
		objectAmount.setIva(0.14);
		objectAmount.setSubtotalIva(1);
		objectAmount.setSubtotalIva0(0);
		objectBody.setAmount(objectAmount);

		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectBody);
		log.info(json);
		response = builder.post(Entity.json(json));

		return response;
	}
	
	public static Response apiCapturePreAuthorize(Invocation.Builder builder, Logger log, String ticket) throws JsonProcessingException {
		Response response = null;
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		builder.header(PRIVATEMERCHANTID, KEYPRIVATEMERCHANTID);
		BodyCapturePreAuthorize objectBody = new BodyCapturePreAuthorize();
		objectBody.setFullResponse(true);
		objectBody.setTicketNumber(ticket);
		Amount objectAmount = new Amount();
		objectAmount.setCurrency("PEN");
		objectAmount.setIce(0);
		objectAmount.setIva(0.0);
		objectAmount.setSubtotalIva(0);
		objectAmount.setSubtotalIva0(600);
		objectBody.setAmount(objectAmount);

		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectBody);
		log.info(json);
		response = builder.post(Entity.json(json));

		return response;
	}	
	
	public static Response apiSubscriptionInfo(Invocation.Builder builder, Logger log) throws JsonProcessingException {
		Response response = null;
		builder.header(PRIVATEMERCHANTID, KEYPRIVATEMERCHANTID);
		response = builder.get();

		return response;
	}
	
	public static Response apiTransaction(Invocation.Builder builder, Logger log) throws JsonProcessingException {
		Response response = null;
		builder.header(PRIVATEMERCHANTID, KEYPRIVATEMERCHANTID);
		response = builder.delete();

		return response;
	}	
	
	public static Response apiTransactionList(Invocation.Builder builder, Logger log) throws JsonProcessingException {
		Response response = null;
		builder.header(PRIVATEMERCHANTID, KEYPRIVATEMERCHANTID);
		response = builder.get();

		return response;
	}
}
