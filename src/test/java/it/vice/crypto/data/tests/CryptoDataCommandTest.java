package it.vice.crypto.data.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import it.vice.crypto.data.assembler.AssemblerJsonToDTO;
import it.vice.crypto.data.client.impl.CallService;
import it.vice.crypto.data.command.CryptoDataCommand;
import it.vice.crypto.data.model.Allowanace;
import it.vice.crypto.data.model.ResponseApiGold;
import it.vice.crypto.data.model.ResponseApiJson;
import it.vice.crypto.data.model.ResponseApiJsonDTO;
import it.vice.crypto.data.model.Result;

@ExtendWith(MockitoExtension.class)
class CryptoDataCommandTest {

	@InjectMocks
	private CryptoDataCommand cryptoDataCommand;
	
	@Mock
	CallService callService;
	
	@Mock
	AssemblerJsonToDTO assemblerJsonToDTO;
	
	@Mock
	ResponseApiGold responseApiGold;
	
	@Mock
	ResponseApiJson responseApiJson;
	
	@Mock
	Result result;
	
	@Mock
	Allowanace allowanace;
    
	@Ignore
	public void retrieveLastBTCEURPriceTest() {
		responseApiJson.setAllowance(allowanace);
		result.setPrice(new BigDecimal("0"));
		responseApiJson.setResult(result);
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		Mockito.when(assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC")).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveLastBTCEURPrice();
	}
	
	@Ignore
	public void retrieveLastXRPEURPriceTest() {
		responseApiJson.setAllowance(allowanace);
		result.setPrice(new BigDecimal("0"));
		responseApiJson.setResult(result);
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		Mockito.when(assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC")).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveLastXRPEURPrice();
	}
	
	@Ignore
	public void retrieveLastETHEURPriceTest() {
		responseApiJson.setAllowance(allowanace);
		result.setPrice(new BigDecimal("0"));
		responseApiJson.setResult(result);
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		Mockito.when(assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC")).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveLastETHEURPrice();
	}
	
	@Ignore
	public void retrieveLastADAEURPriceTest() {
		responseApiJson.setAllowance(allowanace);
		result.setPrice(new BigDecimal("0"));
		responseApiJson.setResult(result);
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		Mockito.when(assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC")).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveLastADAEURPrice();
	}
	
	@Ignore
	public void retrieveLastTRXEURPriceTest() {
		responseApiJson.setAllowance(allowanace);
		result.setPrice(new BigDecimal("0"));
		responseApiJson.setResult(result);
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		Mockito.when(assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC")).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveLastTRXEURPrice();
	}
	
	@Ignore
	public void retrieveLastDOTEURPriceTest() {
		responseApiJson.setAllowance(allowanace);
		result.setPrice(new BigDecimal("0"));
		responseApiJson.setResult(result);
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		Mockito.when(assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC")).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveLastDOTEURPrice();
	}
	
	@Ignore
	public void retrieveLastSTMXEURPriceTest() {
		responseApiJson.setAllowance(allowanace);
		result.setPrice(new BigDecimal("0"));
		responseApiJson.setResult(result);
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		Mockito.when(assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC")).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveLastSTMXEURPrice();
	}
	
	@Ignore
	public void retrieveAllLastCryptoPriceTest() {
		responseApiJson.setAllowance(allowanace);
		result.setPrice(new BigDecimal("0"));
		responseApiJson.setResult(result);
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		Mockito.when(assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC")).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveAllLastCryptoPrice();
		
	}
	
	@Ignore
	public void retrieveLastGoldPriceTest() {
		AssemblerJsonToDTO assemblerJsonToDTO = mock(AssemblerJsonToDTO.class);
		ResponseApiGold responseApiGold = mock(ResponseApiGold.class);
		responseApiGold.setCurrency("EUR");
		responseApiGold.setMetal("AUX");
		responseApiGold.setPrice(new BigDecimal("0"));
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		when(assemblerJsonToDTO.transformerJsonToDTO(responseApiGold, true)).thenReturn(responseApiJsonDTO);
		cryptoDataCommand.retrieveLastGoldPrice(true);
	}
	
}
