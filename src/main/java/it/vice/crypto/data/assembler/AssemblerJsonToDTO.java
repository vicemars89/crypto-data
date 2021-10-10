package it.vice.crypto.data.assembler;

import java.math.BigDecimal;
import java.math.RoundingMode;

import it.vice.crypto.data.model.ResponseApiGold;
import it.vice.crypto.data.model.ResponseApiJson;
import it.vice.crypto.data.model.ResponseApiJsonDTO;

public class AssemblerJsonToDTO {
	
	public ResponseApiJsonDTO transformerJsonToDTO(ResponseApiJson responseApiJson, String crypto) {
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		
		responseApiJsonDTO.setCrypto(crypto);
		responseApiJsonDTO.setPrice(responseApiJson.getResult().getPrice());
		responseApiJsonDTO.setResult(responseApiJson.getResult());
		
		return responseApiJsonDTO;
	}
	
	public ResponseApiJsonDTO transformerJsonToDTO(String onceTrayValue, ResponseApiGold responseApiJson, boolean once) {
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		
		responseApiJsonDTO.setPrice(!once ? responseApiJson.getPrice() : responseApiJson.getPrice().divide(new BigDecimal(onceTrayValue), 2, RoundingMode.HALF_UP));
		responseApiJsonDTO.setCrypto(responseApiJson.getMetal());
		
		return responseApiJsonDTO;
	}
}
