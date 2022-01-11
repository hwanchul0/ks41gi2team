package ksmart41_teamtest.dto;

public class PaymentState {

	private String paymentStateCode;
	private String paymentState;
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
		builder.append("PaymentState [paymentStateCode=");
		builder.append(paymentStateCode);
		builder.append(", paymentState=");
		builder.append(paymentState);
		builder.append("]");
		return builder.toString();
	}
	
}
