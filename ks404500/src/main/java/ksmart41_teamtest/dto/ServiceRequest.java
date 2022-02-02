package ksmart41_teamtest.dto;

public class ServiceRequest {
	private String contractManageCode;
	private String serviceName;
	private String serviceCode;
	private String serviceAmount;
	private String servicePeriod;
	private String serviceTotalPrice;
	private String serviceRequestDate;
	private String serviceRegistrationDate;
	private String serviceEndDate;
	private String serviceRequestStatus;
	private String serviceApprovalDate;
	private String clientId;
	private String mainBusinessCode;
	private String businessCode;
	private String businessLevelCode;
	private String businessRegistrationCode;
	private String businessCodeRegistrationDate;
	private String shopMemberId;
	private String slipNumber;
	
	public String getSlipNumber() {
		return slipNumber;
	}
	public void setSlipNumber(String slipNumber) {
		this.slipNumber = slipNumber;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getShopMemberId() {
		return shopMemberId;
	}
	public void setShopMemberId(String shopMemberId) {
		this.shopMemberId = shopMemberId;
	}
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
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceRequest [contractManageCode=");
		builder.append(contractManageCode);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append(", serviceCode=");
		builder.append(serviceCode);
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
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", businessCode=");
		builder.append(businessCode);
		builder.append(", businessLevelCode=");
		builder.append(businessLevelCode);
		builder.append(", businessRegistrationCode=");
		builder.append(businessRegistrationCode);
		builder.append(", businessCodeRegistrationDate=");
		builder.append(businessCodeRegistrationDate);
		builder.append(", shopMemberId=");
		builder.append(shopMemberId);
		builder.append(", slipNumber=");
		builder.append(slipNumber);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
