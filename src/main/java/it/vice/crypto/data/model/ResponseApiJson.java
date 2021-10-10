package it.vice.crypto.data.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseApiJson {
	
	@JsonProperty
	private Result result;
	@JsonProperty
	private Allowanace allowance;
	
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public Allowanace getAllowance() {
		return allowance;
	}
	public void setAllowance(Allowanace allowance) {
		this.allowance = allowance;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(allowance, result);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseApiJson other = (ResponseApiJson) obj;
		return Objects.equals(allowance, other.allowance) && Objects.equals(result, other.result);
	}
	
	@Override
	public String toString() {
		return "ResponseApiJson [result=" + result + ", allowance=" + allowance + "]";
	}
	
}
