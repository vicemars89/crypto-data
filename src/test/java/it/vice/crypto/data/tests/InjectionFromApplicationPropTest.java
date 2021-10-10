package it.vice.crypto.data.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import it.vice.crypto.data.url.InjectionFromApplicationProp;

@ExtendWith(MockitoExtension.class)
class InjectionFromApplicationPropTest {

	@InjectMocks
	InjectionFromApplicationProp injectionFromApplicationProp;
	
	@Test
	public void allPropsTest() {
		injectionFromApplicationProp.getBtceurURL();
		injectionFromApplicationProp.getAdaeurURL();
		injectionFromApplicationProp.getApiKeyGold();
		injectionFromApplicationProp.getDoteurURL();
		injectionFromApplicationProp.getEtheurURL();
		injectionFromApplicationProp.getGoldeurURL();
		injectionFromApplicationProp.getOnceTrayValue();
		injectionFromApplicationProp.getStmxeurURL();
		injectionFromApplicationProp.getTrxeurURL();
		injectionFromApplicationProp.getXrpeurURL();
	}
	
}
