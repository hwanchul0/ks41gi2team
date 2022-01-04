package ksmart41_teamtest.dto;

public class BusinessCode {
	private String businessCode;
	private String businessCodeName;
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBusinessCodeName() {
		return businessCodeName;
	}
	public void setBusinessCodeName(String businessCodeName) {
		this.businessCodeName = businessCodeName;
	}
	@Override
	public String toString() {
		return "BusinessCode [businessCode=" + businessCode + ", businessCodeName=" + businessCodeName + "]";
	}
	
}
