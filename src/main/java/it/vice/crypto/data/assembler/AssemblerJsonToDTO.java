package it.vice.crypto.data.assembler;

import java.math.BigDecimal;
import java.math.RoundingMode;

import it.vice.crypto.data.model.ResponseApiGold;
import it.vice.crypto.data.model.ResponseApiJson;
import it.vice.crypto.data.model.ResponseApiJsonDTO;
import it.vice.crypto.data.utils.Constants;

public class AssemblerJsonToDTO {
	
	public ResponseApiJsonDTO transformerJsonToDTO(ResponseApiJson responseApiJson, String crypto) {
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		
		responseApiJsonDTO.setCrypto(crypto);
		responseApiJsonDTO.setPrice(responseApiJson.getResult().getPrice());
		responseApiJsonDTO.setResult(responseApiJson.getResult());
		
		return responseApiJsonDTO;
	}
	
	public ResponseApiJsonDTO transformerJsonToDTO(ResponseApiGold responseApiJson, boolean once) {
		ResponseApiJsonDTO responseApiJsonDTO = new ResponseApiJsonDTO();
		
		responseApiJsonDTO.setPrice(!once ? responseApiJson.getPrice() : responseApiJson.getPrice().divide(new BigDecimal(Constants.ONCE_TRAY), 2, RoundingMode.HALF_UP));
		responseApiJsonDTO.setCrypto(Constants.ORO);
		
		return responseApiJsonDTO;
	}
}
