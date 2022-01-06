package ksmart41_teamtest.dto;

public class ClientLevel {

	private String businessLevelCode;
	private String clientLevelName;
	private String clientLevelUpdateDate;
	public String getBusinessLevelCode() {
		return businessLevelCode;
	}
	public void setBusinessLevelCode(String businessLevelCode) {
		this.businessLevelCode = businessLevelCode;
	}
	public String getClientLevelName() {
		return clientLevelName;
	}
	public void setClientLevelName(String clientLevelName) {
		this.clientLevelName = clientLevelName;
	}
	public String getClientLevelUpdateDate() {
		return clientLevelUpdateDate;
	}
	public void setClientLevelUpdateDate(String clientLevelUpdateDate) {
		this.clientLevelUpdateDate = clientLevelUpdateDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientLevel [businessLevelCode=");
		builder.append(businessLevelCode);
		builder.append(", clientLevelName=");
		builder.append(clientLevelName);
		builder.append(", clientLevelUpdateDate=");
		builder.append(clientLevelUpdateDate);
		builder.append("]");
		return builder.toString();
	}
}
