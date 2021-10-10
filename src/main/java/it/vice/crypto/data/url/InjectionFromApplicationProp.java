package it.vice.crypto.data.url;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InjectionFromApplicationProp {

	@Value("${url.lastprice.btc.eur}")
	private String btceurURL;
	@Value("${url.lastprice.xrp.eur}")
	private String xrpeurURL;
	@Value("${url.lastprice.eth.eur}")
	private String etheurURL;
	@Value("${url.lastprice.ada.eur}")
	private String adaeurURL;
	@Value("${url.lastprice.trx.eur}")
	private String trxeurURL;
	@Value("${url.lastprice.dot.eur}")
	private String doteurURL;
	@Value("${url.lastprice.stmx.eur}")
	private String stmxeurURL;
	@Value("${url.lastprice.gold.eur}")
	private String goldeurURL;
	@Value("${api.key.lastprice.gold}")
	private String apiKeyGold;
	@Value("${once.tray.value}")
	private String onceTrayValue;
	
	public String getBtceurURL() {
		return btceurURL;
	}
	public String getXrpeurURL() {
		return xrpeurURL;
	}
	public String getEtheurURL() {
		return etheurURL;
	}
	public String getAdaeurURL() {
		return adaeurURL;
	}
	public String getTrxeurURL() {
		return trxeurURL;
	}
	public String getDoteurURL() {
		return doteurURL;
	}
	public String getStmxeurURL() {
		return stmxeurURL;
	}
	public String getGoldeurURL() {
		return goldeurURL;
	}
	public String getApiKeyGold() {
		return apiKeyGold;
	}
	public String getOnceTrayValue() {
		return onceTrayValue;
	}
	
}
