package it.vice.crypto.data.utils;

public enum CryptoEnum {
	
	BTC("Bitcoin"),
	XRP("Ripple"),
	ETH("Ethereum"),
	ADA("Cardano"),
	TRX("Tron"),
	DOT("PolkaDot"),
	STMX("StormX"),
	ALL("ALL");
	
	public final String label;

	CryptoEnum(String label) {
		this.label = label;
	}
	
	public static CryptoEnum valueOfLabel(String label) {
	    for (CryptoEnum e : values()) {
	        if (e.label.equals(label)) {
	            return e;
	        }
	    }
	    return null;
	}
	
}
