package com.spring.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.spring.consumer.soap.GetStateRequest;
import com.spring.consumer.soap.GetStateResponse;
import com.spring.consumer.soap.State;

@Service
public class SoapConsumerClient {

	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
	
	public State getStateFromSoap(String stateName) {
		// create new xml request, setting the name of the state
		GetStateRequest request = new GetStateRequest();
		request.setName(stateName);
		
		// Send request & recieve response
		template = new WebServiceTemplate(marshaller);
		GetStateResponse response = (GetStateResponse) template.marshalSendAndReceive("http://localhost:8888/soapWS", request);
		return response.getState();
	}
}
