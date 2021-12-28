package ksmart41_teamtest.dto;

public class Client {
	
	private String clientId;
	private String businessLevelCode;
	private String clientPw;
	private String clientName;
	private String clientEmail;
	private String clientRegistration;
	private String clientPhone;
	private String clientStatus;
	private String clientWithdrawal;
	private String clientWithdrawalReason;
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getBusinessLevelCode() {
		return businessLevelCode;
	}
	public void setBusinessLevelCode(String businessLevelCode) {
		this.businessLevelCode = businessLevelCode;
	}
	public String getClientPw() {
		return clientPw;
	}
	public void setClientPw(String clientPw) {
		this.clientPw = clientPw;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getClientRegistration() {
		return clientRegistration;
	}
	public void setClientRegistration(String clientRegistration) {
		this.clientRegistration = clientRegistration;
	}
	public String getClientPhone() {
		return clientPhone;
	}
	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}
	public String getClientStatus() {
		return clientStatus;
	}
	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}
	public String getClientWithdrawal() {
		return clientWithdrawal;
	}
	public void setClientWithdrawal(String clientWithdrawal) {
		this.clientWithdrawal = clientWithdrawal;
	}
	public String getClientWithdrawalReason() {
		return clientWithdrawalReason;
	}
	public void setClientWithdrawalReason(String clientWithdrawalReason) {
		this.clientWithdrawalReason = clientWithdrawalReason;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [clientId=");
		builder.append(clientId);
		builder.append(", businessLevelCode=");
		builder.append(businessLevelCode);
		builder.append(", clientPw=");
		builder.append(clientPw);
		builder.append(", clientName=");
		builder.append(clientName);
		builder.append(", clientEmail=");
		builder.append(clientEmail);
		builder.append(", clientRegistration=");
		builder.append(clientRegistration);
		builder.append(", clientPhone=");
		builder.append(clientPhone);
		builder.append(", clientStatus=");
		builder.append(clientStatus);
		builder.append(", clientWithdrawal=");
		builder.append(clientWithdrawal);
		builder.append(", clientWithdrawalReason=");
		builder.append(clientWithdrawalReason);
		builder.append("]");
		return builder.toString();
	}
	
	
}
