package ksmart41_teamtest.dto;

public class ServicePayment {
	private String paymentCode;
	private String contractManageCode;
	private String slipNumber;
	private String servicePaymentAmount;
	private String servicePaymentDueDate;
	private String paymentSumRegistration;
	
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
		builder.append(", servicePaymentDueDate=");
		builder.append(servicePaymentDueDate);
		builder.append(", paymentSumRegistration=");
		builder.append(paymentSumRegistration);
		builder.append("]");
		return builder.toString();
	}
	
	
}
