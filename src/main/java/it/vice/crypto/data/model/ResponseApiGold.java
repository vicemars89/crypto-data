package it.vice.crypto.data.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseApiGold {
	
	@JsonProperty
	private String metal;
	@JsonProperty
	private String currency;
	@JsonProperty
	private BigDecimal price;
	
	public String getMetal() {
		return metal;
	}
	public void setMetal(String metal) {
		this.metal = metal;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(currency, metal, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseApiGold other = (ResponseApiGold) obj;
		return Objects.equals(currency, other.currency) && Objects.equals(metal, other.metal)
				&& Objects.equals(price, other.price);
	}
	
	@Override
	public String toString() {
		return "ResponseApiGold [metal=" + metal + ", currency=" + currency + ", price=" + price + "]";
	}
	
}
