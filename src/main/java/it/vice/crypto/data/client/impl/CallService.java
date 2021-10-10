package it.vice.crypto.data.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.vice.crypto.data.model.ResponseApiGold;
import it.vice.crypto.data.model.ResponseApiJson;
import it.vice.crypto.data.url.InjectUrlsFromApplicationProp;

@Service
public class CallService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private InjectUrlsFromApplicationProp injectUrlsFromApplicationProp;
	
	public ResponseApiJson retrieveLastBTCEURPrice() {
		ResponseApiJson result = restTemplate.getForObject(injectUrlsFromApplicationProp.getBtceurURL(), ResponseApiJson.class);
		return result;
	}
	
	public ResponseApiJson retrieveLastXRPEURPrice() {
		ResponseApiJson result = restTemplate.getForObject(injectUrlsFromApplicationProp.getXrpeurURL(), ResponseApiJson.class);
		return result;
	}
	
	public ResponseApiJson retrieveLastETHEURPrice() {
		ResponseApiJson result = restTemplate.getForObject(injectUrlsFromApplicationProp.getEtheurURL(), ResponseApiJson.class);
		return result;
	}
	
	public ResponseApiJson retrieveLastADAEURPrice() {
		ResponseApiJson result = restTemplate.getForObject(injectUrlsFromApplicationProp.getAdaeurURL(), ResponseApiJson.class);
		return result;
	}
	
	public ResponseApiJson retrieveLastTRXEURPrice() {
		ResponseApiJson result = restTemplate.getForObject(injectUrlsFromApplicationProp.getTrxeurURL(), ResponseApiJson.class);
		return result;
	}
	
	public ResponseApiJson retrieveLastDOTEURPrice() {
		ResponseApiJson result = restTemplate.getForObject(injectUrlsFromApplicationProp.getDoteurURL(), ResponseApiJson.class);
		return result;
	}
	
	public ResponseApiJson retrieveLastSTMXEURPrice() {
		ResponseApiJson result = restTemplate.getForObject(injectUrlsFromApplicationProp.getStmxeurURL(), ResponseApiJson.class);
		return result;
	}
	
	public List<ResponseApiJson> retrieveAllLastCryptoEurPrice() {
		List<ResponseApiJson> listResponseApiJson = new ArrayList<ResponseApiJson>();
		ResponseApiJson bitcoin = retrieveLastBTCEURPrice();
		ResponseApiJson ripple = retrieveLastXRPEURPrice();
		ResponseApiJson ethereum = retrieveLastETHEURPrice();
		ResponseApiJson cardano = retrieveLastADAEURPrice();
		ResponseApiJson tron = retrieveLastTRXEURPrice();
		ResponseApiJson polkadot = retrieveLastDOTEURPrice();
		ResponseApiJson stormx = retrieveLastSTMXEURPrice();
		listResponseApiJson.add(bitcoin);
		listResponseApiJson.add(ripple);
		listResponseApiJson.add(ethereum);
		listResponseApiJson.add(cardano);
		listResponseApiJson.add(tron);
		listResponseApiJson.add(polkadot);
		listResponseApiJson.add(stormx);
		
		return listResponseApiJson;
	}
	
	public ResponseApiGold retrieveLastGoldPrice() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("x-access-token", injectUrlsFromApplicationProp.getApiKeyGold());
		headers.set("Content-Type", "application/json");

		HttpEntity entity = new HttpEntity(headers);

		ResponseApiGold response = restTemplate.exchange(injectUrlsFromApplicationProp.getGoldeurURL(), HttpMethod.GET, entity, ResponseApiGold.class).getBody();
		
		return response;
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
}
