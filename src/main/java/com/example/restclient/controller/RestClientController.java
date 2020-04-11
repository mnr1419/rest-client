package com.example.restclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/restClient")
public class RestClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String getRestServerMessage(){
		return restTemplate.getForObject("http://rest-server/restserver/getMessage", String.class);
	}
}
