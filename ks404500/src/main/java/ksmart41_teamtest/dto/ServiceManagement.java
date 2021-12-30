package ksmart41_teamtest.dto;

public class ServiceManagement {
	private String serviceCode;
	private String memberId;
	private String serviceName;
	private String servicePrice;
	private String serviceDiscount;
	private String servicePeriod;
	private String serviceStatus;
	private String serviceRegistrationDate;
	private String serviceDeleteDate;
	
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}
	public String getServiceDiscount() {
		return serviceDiscount;
	}
	public void setServiceDiscount(String serviceDiscount) {
		this.serviceDiscount = serviceDiscount;
	}
	public String getServicePeriod() {
		return servicePeriod;
	}
	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public String getServiceRegistrationDate() {
		return serviceRegistrationDate;
	}
	public void setServiceRegistrationDate(String serviceRegistrationDate) {
		this.serviceRegistrationDate = serviceRegistrationDate;
	}
	public String getServiceDeleteDate() {
		return serviceDeleteDate;
	}
	public void setServiceDeleteDate(String serviceDeleteDate) {
		this.serviceDeleteDate = serviceDeleteDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceManagement [serviceCode=");
		builder.append(serviceCode);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append(", servicePrice=");
		builder.append(servicePrice);
		builder.append(", serviceDiscount=");
		builder.append(serviceDiscount);
		builder.append(", servicePeriod=");
		builder.append(servicePeriod);
		builder.append(", serviceStatus=");
		builder.append(serviceStatus);
		builder.append(", serviceRegistrationDate=");
		builder.append(serviceRegistrationDate);
		builder.append(", serviceDeleteDate=");
		builder.append(serviceDeleteDate);
		builder.append(", serviceApprovalDate=");
		builder.append("]");
		return builder.toString();
	}
	
	
}
