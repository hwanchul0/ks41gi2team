package ksmart41_teamtest.dto;

public class ServicePayment {
	private String paymentCode;
	private String contractManageCode;
	private String slipNumber;
	private String servicePaymentAmount;
	private String paymentStateCode;
	private String paymentState;
	private String servicePaymentDueDate;
	private String paymentSumRegistration;
	private String clientId;
	private String paymentEstimate;
	private String paymentCharge;
	private String paymentBalance;
	private String paymentType;
	private String paymentDate;
	
	public String getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	public String getPaymentStateCode() {
		return paymentStateCode;
	}
	public void setPaymentStateCode(String paymentStateCode) {
		this.paymentStateCode = paymentStateCode;
	}
	public String getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getContractManageCode() {
		return contractManageCode;
	}
	public void setContractManageCode(String contractManageCode) {
		this.contractManageCode = contractManageCode;
	}
	public String getSlipNumber() {
		return slipNumber;
	}
	public void setSlipNumber(String slipNumber) {
		this.slipNumber = slipNumber;
	}
	public String getServicePaymentAmount() {
		return servicePaymentAmount;
	}
	public void setServicePaymentAmount(String servicePaymentAmount) {
		this.servicePaymentAmount = servicePaymentAmount;
	}
	public String getServicePaymentDueDate() {
		return servicePaymentDueDate;
	}
	public void setServicePaymentDueDate(String servicePaymentDueDate) {
		this.servicePaymentDueDate = servicePaymentDueDate;
	}
	public String getPaymentSumRegistration() {
		return paymentSumRegistration;
	}
	public void setPaymentSumRegistration(String paymentSumRegistration) {
		this.paymentSumRegistration = paymentSumRegistration;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getPaymentEstimate() {
		return paymentEstimate;
	}
	public void setPaymentEstimate(String paymentEstimate) {
		this.paymentEstimate = paymentEstimate;
	}
	public String getPaymentCharge() {
		return paymentCharge;
	}
	public void setPaymentCharge(String paymentCharge) {
		this.paymentCharge = paymentCharge;
	}
	public String getPaymentBalance() {
		return paymentBalance;
	}
	public void setPaymentBalance(String paymentBalance) {
		this.paymentBalance = paymentBalance;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServicePayment [paymentCode=");
		builder.append(paymentCode);
		builder.append(", contractManageCode=");
		builder.append(contractManageCode);
		builder.append(", slipNumber=");
		builder.append(slipNumber);
		builder.append(", servicePaymentAmount=");
		builder.append(servicePaymentAmount);
		builder.append(", paymentStateCode=");
		builder.append(paymentStateCode);
		builder.append(", paymentState=");
		builder.append(paymentState);
		builder.append(", servicePaymentDueDate=");
		builder.append(servicePaymentDueDate);
		builder.append(", paymentSumRegistration=");
		builder.append(paymentSumRegistration);
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", paymentEstimate=");
		builder.append(paymentEstimate);
		builder.append(", paymentCharge=");
		builder.append(paymentCharge);
		builder.append(", paymentBalance=");
		builder.append(paymentBalance);
		builder.append(", paymentType=");
		builder.append(paymentType);
		builder.append(", paymentDate=");
		builder.append(paymentDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
