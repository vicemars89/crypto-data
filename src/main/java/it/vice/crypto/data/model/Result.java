package it.vice.crypto.data.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Result {

	private BigDecimal price;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Result other = (Result) obj;
		return Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Result [price=" + price + "]";
	}
	
}
