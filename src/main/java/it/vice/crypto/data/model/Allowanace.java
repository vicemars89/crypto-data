package it.vice.crypto.data.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Allowanace {

	private BigDecimal cost;
	private BigDecimal remaining;
	private String upgrade;
	
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public BigDecimal getRemaining() {
		return remaining;
	}
	public void setRemaining(BigDecimal remaining) {
		this.remaining = remaining;
	}
	public String getUpgrade() {
		return upgrade;
	}
	public void setUpgrade(String upgrade) {
		this.upgrade = upgrade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cost, remaining, upgrade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Allowanace other = (Allowanace) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(remaining, other.remaining)
				&& Objects.equals(upgrade, other.upgrade);
	}
	
	@Override
	public String toString() {
		return "Allowanace [cost=" + cost + ", remaining=" + remaining + ", upgrade=" + upgrade + "]";
	}
	
}
