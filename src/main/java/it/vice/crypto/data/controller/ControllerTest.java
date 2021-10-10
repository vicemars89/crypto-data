package it.vice.crypto.data.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import it.vice.crypto.data.command.CryptoDataCommand;
import it.vice.crypto.data.model.ResponseApiJsonDTO;

@RestController
@CrossOrigin("*")
public class ControllerTest {
	
	@Autowired
	private CryptoDataCommand cryptoDataCommand;
	
	  @GetMapping("/bitcoin-eur")
	  public ResponseEntity<ResponseApiJsonDTO> getLastBTCPrice() {
		  ResponseApiJsonDTO result = cryptoDataCommand.retrieveLastBTCEURPrice();
		  return ResponseEntity.ok(result);
	  }
	
	  @GetMapping("/ripple-eur")
	  public ResponseEntity<ResponseApiJsonDTO> getLastXRPPrice() {
		  ResponseApiJsonDTO result = cryptoDataCommand.retrieveLastXRPEURPrice();
		  return ResponseEntity.ok(result);
	  }
	
	  @GetMapping("/ethereum-eur")
	  public ResponseEntity<ResponseApiJsonDTO> getLastETHPrice() {
		  ResponseApiJsonDTO result = cryptoDataCommand.retrieveLastETHEURPrice();
		  return ResponseEntity.ok(result);
	  }
	
	  @GetMapping("/cardano-eur")
	  public ResponseEntity<ResponseApiJsonDTO> getLastADAPrice() {
		  ResponseApiJsonDTO result = cryptoDataCommand.retrieveLastADAEURPrice();
		  return ResponseEntity.ok(result);
	  }
	
	  @GetMapping("/tron-eur")
	  public ResponseEntity<ResponseApiJsonDTO> getLastTRXPrice() {
		  ResponseApiJsonDTO result = cryptoDataCommand.retrieveLastTRXEURPrice();
		  return ResponseEntity.ok(result);
	  }
	
	  @GetMapping("/polkadot-eur")
	  public ResponseEntity<ResponseApiJsonDTO> getLastDOTPrice() {
		  ResponseApiJsonDTO result = cryptoDataCommand.retrieveLastDOTEURPrice();
		  return ResponseEntity.ok(result);
	  }
	
	  @GetMapping("/stormx-eur")
	  public ResponseEntity<ResponseApiJsonDTO> getLastSTMXPrice() {
		  ResponseApiJsonDTO result = cryptoDataCommand.retrieveLastSTMXEURPrice();
		  return ResponseEntity.ok(result);
	  }
	  
	  @GetMapping("/every-crypto-eur")
	  public ResponseEntity<List<ResponseApiJsonDTO>> getLastAllCryptoPrices() {
		  List<ResponseApiJsonDTO> result = cryptoDataCommand.retrieveAllLastCryptoPrice();
		  return ResponseEntity.ok(result);
	  }
	  
	  @GetMapping("/gold-eur")
	  public ResponseEntity<ResponseApiJsonDTO> getLastGoldPrice(@ApiParam(name = "gram", value = "True: price in gram. False: price in once tray.", required = false) @PathParam("gram") boolean gram) {
		  ResponseApiJsonDTO result = cryptoDataCommand.retrieveLastGoldPrice(gram);
		  return ResponseEntity.ok(result);
	  }
	  
}
