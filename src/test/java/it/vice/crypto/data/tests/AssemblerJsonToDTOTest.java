package it.vice.crypto.data.tests;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import it.vice.crypto.data.assembler.AssemblerJsonToDTO;
import it.vice.crypto.data.model.Allowanace;
import it.vice.crypto.data.model.ResponseApiGold;
import it.vice.crypto.data.model.ResponseApiJson;
import it.vice.crypto.data.model.Result;

@ExtendWith(MockitoExtension.class)
class AssemblerJsonToDTOTest {
	
	@InjectMocks
	private AssemblerJsonToDTO assemblerJsonToDTO;
	
	@Mock
	ResponseApiJson responseApiJson;
	
	@Mock
	Result result;
	
	@Mock
	ResponseApiGold responseApiGold;
	
	@Test
	public void transformerJsonToDTOTest() {
		responseApiJson = new ResponseApiJson();
		responseApiJson.setAllowance(new Allowanace());
		responseApiJson.setResult(result);
		assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, "BTC");
		
	}
	
	@Test
	public void transformerJsonToDTOTrueTest() {
		responseApiGold = new ResponseApiGold();
		responseApiGold.setCurrency("EUR");
		responseApiGold.setPrice(new BigDecimal("0"));
		assemblerJsonToDTO.transformerJsonToDTO(responseApiGold, true);
		
	}
	
	@Test
	public void transformerJsonToDTOFalseTest() {
		assemblerJsonToDTO.transformerJsonToDTO(responseApiGold, false);
		
	}
}
