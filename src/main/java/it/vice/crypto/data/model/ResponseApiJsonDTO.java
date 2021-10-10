package it.vice.crypto.data.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseApiJsonDTO {

	@JsonProperty
	private String crypto;
	@JsonProperty
	private BigDecimal price;
	@JsonProperty
	private Result result;
	
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public String getCrypto() {
		return crypto;
	}
	public void setCrypto(String crypto) {
		this.crypto = crypto;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(crypto, price, result);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseApiJsonDTO other = (ResponseApiJsonDTO) obj;
		return Objects.equals(crypto, other.crypto) && Objects.equals(price, other.price)
				&& Objects.equals(result, other.result);
	}
	
	@Override
	public String toString() {
		return "ResponseApiJsonDTO [crypto=" + crypto + ", price=" + price + ", result=" + result + "]";
	}
	
}
