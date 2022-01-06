package ksmart41_teamtest.dto;

public class GetInvoiceInfo {
	private String mainBusinessCode;
	private String businessName;
	private String clientId;
	private String businessRepresentativeName;
	private String businessNumber;
	private String businessAddr;
	private String businessEmail;
	private String businessManagerEmail;
	private String businessType1;
	private String businessType2;
	private String serviceCode;
	private int serviceAmount;
	private String servicePeriod;
	private String serviceName;
	private String slipNumber;
	private String serviceRegistrationDate;
	private int serviceTotalPrice;
	private int nontax;
	private int tax;
	private String invoiceCode;
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getBusinessRepresentativeName() {
		return businessRepresentativeName;
	}
	public void setBusinessRepresentativeName(String businessRepresentativeName) {
		this.businessRepresentativeName = businessRepresentativeName;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public String getBusinessAddr() {
		return businessAddr;
	}
	public void setBusinessAddr(String businessAddr) {
		this.businessAddr = businessAddr;
	}
	public String getBusinessEmail() {
		return businessEmail;
	}
	public void setBusinessEmail(String businessEmail) {
		this.businessEmail = businessEmail;
	}
	public String getBusinessManagerEmail() {
		return businessManagerEmail;
	}
	public void setBusinessManagerEmail(String businessManagerEmail) {
		this.businessManagerEmail = businessManagerEmail;
	}
	public String getBusinessType1() {
		return businessType1;
	}
	public void setBusinessType1(String businessType1) {
		this.businessType1 = businessType1;
	}
	public String getBusinessType2() {
		return businessType2;
	}
	public void setBusinessType2(String businessType2) {
		this.businessType2 = businessType2;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public int getServiceAmount() {
		return serviceAmount;
	}
	public void setServiceAmount(int serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServicePeriod() {
		return servicePeriod;
	}
	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getSlipNumber() {
		return slipNumber;
	}
	public void setSlipNumber(String slipNumber) {
		this.slipNumber = slipNumber;
	}
	public String getServiceRegistrationDate() {
		return serviceRegistrationDate;
	}
	public void setServiceRegistrationDate(String serviceRegistrationDate) {
		this.serviceRegistrationDate = serviceRegistrationDate;
	}
	public int getServiceTotalPrice() {
		return serviceTotalPrice;
	}
	public void setServiceTotalPrice(int serviceTotalPrice) {
		this.serviceTotalPrice = serviceTotalPrice;
	}
	public int getNontax() {
		return nontax;
	}
	public void setNontax(int nontax) {
		this.nontax = nontax;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	@Override
	public String toString() {
		return "GetInvoiceInfo [mainBusinessCode=" + mainBusinessCode + ", businessName=" + businessName + ", clientId="
				+ clientId + ", businessRepresentativeName=" + businessRepresentativeName + ", businessNumber="
				+ businessNumber + ", businessAddr=" + businessAddr + ", businessEmail=" + businessEmail
				+ ", businessManagerEmail=" + businessManagerEmail + ", businessType1=" + businessType1
				+ ", businessType2=" + businessType2 + ", serviceCode=" + serviceCode + ", serviceAmount="
				+ serviceAmount + ", servicePeriod=" + servicePeriod + ", serviceName=" + serviceName + ", slipNumber="
				+ slipNumber + ", serviceRegistrationDate=" + serviceRegistrationDate + ", serviceTotalPrice="
				+ serviceTotalPrice + ", nontax=" + nontax + ", tax=" + tax + ", invoiceCode=" + invoiceCode + "]";
	}
	
	
	
}
