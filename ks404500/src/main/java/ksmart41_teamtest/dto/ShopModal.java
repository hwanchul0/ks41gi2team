package ksmart41_teamtest.dto;

public class ShopModal {
	private String mainBusinessCode;
	private String businessCode;
	private String businessLevelCode;
	private String businessRegistrationCode;
	private String businessCodeRegistrationDate;
	private String businessCodeDeleteDate;
	private String clientId;
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBusinessLevelCode() {
		return businessLevelCode;
	}
	public void setBusinessLevelCode(String businessLevelCode) {
		this.businessLevelCode = businessLevelCode;
	}
	public String getBusinessRegistrationCode() {
		return businessRegistrationCode;
	}
	public void setBusinessRegistrationCode(String businessRegistrationCode) {
		this.businessRegistrationCode = businessRegistrationCode;
	}
	public String getBusinessCodeRegistrationDate() {
		return businessCodeRegistrationDate;
	}
	public void setBusinessCodeRegistrationDate(String businessCodeRegistrationDate) {
		this.businessCodeRegistrationDate = businessCodeRegistrationDate;
	}
	public String getBusinessCodeDeleteDate() {
		return businessCodeDeleteDate;
	}
	public void setBusinessCodeDeleteDate(String businessCodeDeleteDate) {
		this.businessCodeDeleteDate = businessCodeDeleteDate;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopModal [mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", businessCode=");
		builder.append(businessCode);
		builder.append(", businessLevelCode=");
		builder.append(businessLevelCode);
		builder.append(", businessRegistrationCode=");
		builder.append(businessRegistrationCode);
		builder.append(", businessCodeRegistrationDate=");
		builder.append(businessCodeRegistrationDate);
		builder.append(", businessCodeDeleteDate=");
		builder.append(businessCodeDeleteDate);
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append("]");
		return builder.toString();
	}
	
}
