package it.vice.crypto.data.client.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import it.vice.crypto.data.model.ResponseApiGold;

@Service
public class MockService {

	public ResponseApiGold mockResponse() {
		ResponseApiGold response = new ResponseApiGold();
		
		response.setCurrency("MOCK");
		response.setMetal("MOCK");
		response.setPrice(new BigDecimal("1000.0"));
		
		return response;
	}
	
}
