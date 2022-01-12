package ksmart41_teamtest.dto;

public class Code {
	private String contractStateCode;
	private String contractState;
	private String refundStateCode;
	private String refundState;
	private String paymentStateCode;
	private String paymentState;
	public String getContractStateCode() {
		return contractStateCode;
	}
	public void setContractStateCode(String contractStateCode) {
		this.contractStateCode = contractStateCode;
	}
	public String getContractState() {
		return contractState;
	}
	public void setContractState(String contractState) {
		this.contractState = contractState;
	}
	public String getRefundStateCode() {
		return refundStateCode;
	}
	public void setRefundStateCode(String refundStateCode) {
		this.refundStateCode = refundStateCode;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}
	public String getPaymentStateCode() {
		return paymentStateCode;
	}
	public void setPaymentStateCode(String paymentStateCode) {
		this.paymentStateCode = paymentStateCode;
	}
	public String getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Code [contractStateCode=");
		builder.append(contractStateCode);
		builder.append(", contractState=");
		builder.append(contractState);
		builder.append(", refundStateCode=");
		builder.append(refundStateCode);
		builder.append(", refundState=");
		builder.append(refundState);
		builder.append(", paymentStateCode=");
		builder.append(paymentStateCode);
		builder.append(", paymentState=");
		builder.append(paymentState);
		builder.append("]");
		return builder.toString();
	}
	
}
