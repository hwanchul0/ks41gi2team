package ksmart41_teamtest.dto;

public class Request {
	private String clientId;
	private String memberId;
	private String contractManageCode;
	private String serviceName;
	private String serviceAmount;
	private String servicePeriod;
	private String serviceTotalPrice;
	private String serviceRequestDate;
	private String serviceRegistrationDate;
	private String serviceEndDate;
	private String serviceRequestStatus;
	private String serviceApprovalDate;
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getContractManageCode() {
		return contractManageCode;
	}
	public void setContractManageCode(String contractManageCode) {
		this.contractManageCode = contractManageCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceAmount() {
		return serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServicePeriod() {
		return servicePeriod;
	}
	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}
	public String getServiceTotalPrice() {
		return serviceTotalPrice;
	}
	public void setServiceTotalPrice(String serviceTotalPrice) {
		this.serviceTotalPrice = serviceTotalPrice;
	}
	public String getServiceRequestDate() {
		return serviceRequestDate;
	}
	public void setServiceRequestDate(String serviceRequestDate) {
		this.serviceRequestDate = serviceRequestDate;
	}
	public String getServiceRegistrationDate() {
		return serviceRegistrationDate;
	}
	public void setServiceRegistrationDate(String serviceRegistrationDate) {
		this.serviceRegistrationDate = serviceRegistrationDate;
	}
	public String getServiceEndDate() {
		return serviceEndDate;
	}
	public void setServiceEndDate(String serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}
	public String getServiceRequestStatus() {
		return serviceRequestStatus;
	}
	public void setServiceRequestStatus(String serviceRequestStatus) {
		this.serviceRequestStatus = serviceRequestStatus;
	}
	public String getServiceApprovalDate() {
		return serviceApprovalDate;
	}
	public void setServiceApprovalDate(String serviceApprovalDate) {
		this.serviceApprovalDate = serviceApprovalDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Request [clientId=");
		builder.append(clientId);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", contractManageCode=");
		builder.append(contractManageCode);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append(", serviceAmount=");
		builder.append(serviceAmount);
		builder.append(", servicePeriod=");
		builder.append(servicePeriod);
		builder.append(", serviceTotalPrice=");
		builder.append(serviceTotalPrice);
		builder.append(", serviceRequestDate=");
		builder.append(serviceRequestDate);
		builder.append(", serviceRegistrationDate=");
		builder.append(serviceRegistrationDate);
		builder.append(", serviceEndDate=");
		builder.append(serviceEndDate);
		builder.append(", serviceRequestStatus=");
		builder.append(serviceRequestStatus);
		builder.append(", serviceApprovalDate=");
		builder.append(serviceApprovalDate);
		builder.append(", serviceCode=");
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append("]");
		return builder.toString();
	}
	
}