package ksmart41_teamtest.dto;

public class ServiceManagement {
	private String serviceCode;
	private String memberId;
	private String serviceName;
	private String servicePrice;
	private String serviceDiscount;
	private int servicePeriod;
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
	public int getServicePeriod() {
		return servicePeriod;
	}
	public void setServicePeriod(int servicePeriod) {
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
		return "ServiceManagement [serviceCode=" + serviceCode + ", memberId=" + memberId + ", serviceName="
				+ serviceName + ", servicePrice=" + servicePrice + ", serviceDiscount=" + serviceDiscount
				+ ", servicePeriod=" + servicePeriod + ", serviceStatus=" + serviceStatus + ", serviceRegistrationDate="
				+ serviceRegistrationDate + ", serviceDeleteDate=" + serviceDeleteDate + "]";
	}
	
}
