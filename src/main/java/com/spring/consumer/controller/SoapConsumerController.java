package com.spring.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.consumer.service.SoapConsumerClient;
import com.spring.consumer.soap.State;

@RestController
public class SoapConsumerController {

	@Autowired
	private SoapConsumerClient client;
	
	@GetMapping("/getState/{stateName}")
	public State getState(@PathVariable String stateName) {
		return client.getStateFromSoap(stateName);
	}
}
