package it.vice.crypto.data.url;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InjectUrlsFromApplicationProp {

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
	
}
