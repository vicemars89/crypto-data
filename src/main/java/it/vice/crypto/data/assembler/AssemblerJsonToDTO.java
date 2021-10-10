package it.vice.crypto.data.assembler;

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
}
