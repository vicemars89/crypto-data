package it.vice.crypto.data.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import it.vice.crypto.data.client.impl.CallService;
import it.vice.crypto.data.url.InjectionFromApplicationProp;

@ExtendWith(MockitoExtension.class)
class CallServiceTest {

	@InjectMocks
	private CallService callImpl;
	
	@Mock
	private RestTemplate restTemplate;
	
	@Mock
	private InjectionFromApplicationProp injectUrlsFromApplicationProp;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void retrieveLastBTCEURPriceTest() {
		restTemplate = Mockito.mock(RestTemplate.class);
		Mockito.when(injectUrlsFromApplicationProp.getBtceurURL()).thenReturn("URL");
		callImpl.retrieveLastBTCEURPrice();
	}
	
	@Test
	public void retrieveLastXRPEURPriceTest() {
		restTemplate = Mockito.mock(RestTemplate.class);
		callImpl.retrieveLastXRPEURPrice();
	}
	
	@Test
	public void retrieveLastETHEURPriceTest() {
		restTemplate = Mockito.mock(RestTemplate.class);
		callImpl.retrieveLastETHEURPrice();
	}
	
	@Test
	public void retrieveLastADAEURPriceTest() {
		restTemplate = Mockito.mock(RestTemplate.class);
		callImpl.retrieveLastADAEURPrice();
	}
	
	@Test
	public void retrieveLastTRXEURPriceTest() {
		restTemplate = Mockito.mock(RestTemplate.class);
		callImpl.retrieveLastTRXEURPrice();
	}
	
	@Test
	public void retrieveLastDOTEURPriceTest() {
		restTemplate = Mockito.mock(RestTemplate.class);
		callImpl.retrieveLastDOTEURPrice();
	}
	
	@Test
	public void retrieveLastSTMXEURPriceTest() {
		restTemplate = Mockito.mock(RestTemplate.class);
		callImpl.retrieveLastSTMXEURPrice();
	}
	
	@Test
	public void retrieveAllLastCryptoEurPriceTest() {
		restTemplate = Mockito.mock(RestTemplate.class);
		callImpl.retrieveAllLastCryptoEurPrice();
	}
	
	@Test
	public void restTemplateTest() {
		callImpl.restTemplate();
	}

}
