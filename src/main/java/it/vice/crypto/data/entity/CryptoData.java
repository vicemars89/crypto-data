package it.vice.crypto.data.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "CryptoData")
@Table(name = "CRYPTO_DATA")
public class CryptoData {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CRYPTO_DATA_SEQ")
    @SequenceGenerator(sequenceName = "CRYPTO_DATA_SEQ", allocationSize = 1, name = "CRYPTO_DATA_SEQ")
    private Long id;
    private String assetName;
    private BigDecimal lastPrice;
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    @Version
    private Timestamp version;
    
	public CryptoData(String assetName, BigDecimal lastPrice) {
		this.assetName = assetName;
		this.lastPrice = lastPrice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public BigDecimal getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(BigDecimal lastPrice) {
		this.lastPrice = lastPrice;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Timestamp getVersion() {
		return version;
	}
	public void setVersion(Timestamp version) {
		this.version = version;
	}
    
}
