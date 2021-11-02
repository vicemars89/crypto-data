package it.vice.crypto.data.command;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.vice.crypto.data.assembler.AssemblerJsonToDTO;
import it.vice.crypto.data.client.impl.CallService;
import it.vice.crypto.data.entity.CryptoData;
import it.vice.crypto.data.model.ResponseApiGold;
import it.vice.crypto.data.model.ResponseApiJson;
import it.vice.crypto.data.model.ResponseApiJsonDTO;
import it.vice.crypto.data.repository.CryptoDataRepository;
import it.vice.crypto.data.utils.CryptoEnum;

@Service
public class CryptoDataCommand {

	@Autowired
	private CallService callService;
	
	@Autowired
	CryptoDataRepository cryptoDataRepository;
	
	public ResponseApiJsonDTO retrieveLastBTCEURPrice() {
		AssemblerJsonToDTO assemblerJsonToDTO = new AssemblerJsonToDTO();
		ResponseApiJson responseApiJson = callService.retrieveLastBTCEURPrice();
		ResponseApiJsonDTO responseApiJsonDTO = assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, CryptoEnum.BTC.label);
		cryptoDataRepository.save(new CryptoData(CryptoEnum.BTC.label, responseApiJsonDTO.getPrice()));
		return responseApiJsonDTO;
	}
	
	public ResponseApiJsonDTO retrieveLastXRPEURPrice() {
		AssemblerJsonToDTO assemblerJsonToDTO = new AssemblerJsonToDTO();
		ResponseApiJson responseApiJson = callService.retrieveLastXRPEURPrice();
		ResponseApiJsonDTO responseApiJsonDTO = assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, CryptoEnum.XRP.label);
		cryptoDataRepository.save(new CryptoData(CryptoEnum.XRP.label, responseApiJsonDTO.getPrice()));
		return responseApiJsonDTO;
	}
	
	public ResponseApiJsonDTO retrieveLastETHEURPrice() {
		AssemblerJsonToDTO assemblerJsonToDTO = new AssemblerJsonToDTO();
		ResponseApiJson responseApiJson = callService.retrieveLastETHEURPrice();
		ResponseApiJsonDTO responseApiJsonDTO = assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, CryptoEnum.ETH.label);
		cryptoDataRepository.save(new CryptoData(CryptoEnum.ETH.label, responseApiJsonDTO.getPrice()));
		return responseApiJsonDTO;
	}
	
	public ResponseApiJsonDTO retrieveLastADAEURPrice() {
		AssemblerJsonToDTO assemblerJsonToDTO = new AssemblerJsonToDTO();
		ResponseApiJson responseApiJson = callService.retrieveLastADAEURPrice();
		ResponseApiJsonDTO responseApiJsonDTO = assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, CryptoEnum.ADA.label);
		cryptoDataRepository.save(new CryptoData(CryptoEnum.ADA.label, responseApiJsonDTO.getPrice()));
		return responseApiJsonDTO;
	}
	
	public ResponseApiJsonDTO retrieveLastTRXEURPrice() {
		AssemblerJsonToDTO assemblerJsonToDTO = new AssemblerJsonToDTO();
		ResponseApiJson responseApiJson = callService.retrieveLastTRXEURPrice();
		ResponseApiJsonDTO responseApiJsonDTO = assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, CryptoEnum.TRX.label);
		cryptoDataRepository.save(new CryptoData(CryptoEnum.TRX.label, responseApiJsonDTO.getPrice()));
		return responseApiJsonDTO;
	}
	
	public ResponseApiJsonDTO retrieveLastDOTEURPrice() {
		AssemblerJsonToDTO assemblerJsonToDTO = new AssemblerJsonToDTO();
		ResponseApiJson responseApiJson = callService.retrieveLastDOTEURPrice();
		ResponseApiJsonDTO responseApiJsonDTO = assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, CryptoEnum.DOT.label);
		cryptoDataRepository.save(new CryptoData(CryptoEnum.DOT.label, responseApiJsonDTO.getPrice()));
		return responseApiJsonDTO;
	}
	
	public ResponseApiJsonDTO retrieveLastSTMXEURPrice() {
		AssemblerJsonToDTO assemblerJsonToDTO = new AssemblerJsonToDTO();
		ResponseApiJson responseApiJson = callService.retrieveLastSTMXEURPrice();
		ResponseApiJsonDTO responseApiJsonDTO = assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, CryptoEnum.STMX.label);
		cryptoDataRepository.save(new CryptoData(CryptoEnum.STMX.label, responseApiJsonDTO.getPrice()));
		return responseApiJsonDTO;
	}
	
	public List<ResponseApiJsonDTO> retrieveAllLastCryptoPrice() {
		
		List<ResponseApiJsonDTO> responseListApiJsonDTO = new ArrayList<ResponseApiJsonDTO>();
		ResponseApiJsonDTO bitcoin = retrieveLastBTCEURPrice();
		ResponseApiJsonDTO ripple = retrieveLastXRPEURPrice();
		ResponseApiJsonDTO ethereum = retrieveLastETHEURPrice();
		ResponseApiJsonDTO cardano = retrieveLastADAEURPrice();
		ResponseApiJsonDTO tron = retrieveLastTRXEURPrice();
		ResponseApiJsonDTO polkadot = retrieveLastDOTEURPrice();
		ResponseApiJsonDTO stormx = retrieveLastSTMXEURPrice();
		responseListApiJsonDTO.add(bitcoin);
		responseListApiJsonDTO.add(ripple);
		responseListApiJsonDTO.add(ethereum);
		responseListApiJsonDTO.add(cardano);
		responseListApiJsonDTO.add(tron);
		responseListApiJsonDTO.add(polkadot);
		responseListApiJsonDTO.add(stormx);
		
		return responseListApiJsonDTO;
	}
	
	public ResponseApiJsonDTO retrieveLastGoldPrice(boolean peso) {
		AssemblerJsonToDTO assemblerJsonToDTO = new AssemblerJsonToDTO();
		ResponseApiGold responseApiJson = callService.retrieveLastGoldPrice();
		ResponseApiJsonDTO responseApiJsonDTO = assemblerJsonToDTO.transformerJsonToDTO(responseApiJson, peso);
		cryptoDataRepository.save(new CryptoData("Oro", responseApiJsonDTO.getPrice()));
		return responseApiJsonDTO;
	}
	
}
