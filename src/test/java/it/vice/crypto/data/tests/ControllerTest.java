package it.vice.crypto.data.tests;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import it.vice.crypto.data.command.CryptoDataCommand;
import it.vice.crypto.data.controller.Controller;

@ExtendWith(MockitoExtension.class)
class ControllerTest {
	
	@InjectMocks
	private Controller controller;
	
	@Mock
	private CryptoDataCommand cryptoDataCommand;
	
	@Test
	void contextLoads() {
	}
	
	  @Test
	  public void getLastBTCPrice() {
		  controller.getLastBTCPrice();
	  }
	
	  @Test
	  public void getLastXRPPrice() {
		  controller.getLastXRPPrice();
	  }
	
	  @Test
	  public void getLastETHPrice() {
		  controller.getLastETHPrice();
	  }
	
	  @Test
	  public void getLastADAPrice() {
		  controller.getLastADAPrice();
	  }
	
	  @Test
	  public void getLastTRXPrice() {
		  controller.getLastTRXPrice();
	  }
	
	  @Test
	  public void getLastDOTPrice() {
		  controller.getLastDOTPrice();
	  }
	
	  @Test
	  public void getLastSTMXPrice() {
		  controller.getLastSTMXPrice();
	  }
	
	  @Test
	  public void getLastAllCryptoPrices() {
		  controller.getLastAllCryptoPrices();
	  }
	
	  @Test
	  public void getLastGoldPrice() {
		  controller.getLastGoldPrice(Mockito.anyBoolean());
	  }
	  
}
