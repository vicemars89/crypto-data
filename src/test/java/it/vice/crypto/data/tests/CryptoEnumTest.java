package it.vice.crypto.data.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import it.vice.crypto.data.utils.CryptoEnum;

@ExtendWith(MockitoExtension.class)
class CryptoEnumTest {
	
	@Test
	public void enumTest() {
		CryptoEnum.valueOf("ADA");
		CryptoEnum.valueOfLabel("ETH");
	}
	
	@Test
	public void enumTestLabel() {
		CryptoEnum.valueOfLabel("Cardano");
	}
	
}
