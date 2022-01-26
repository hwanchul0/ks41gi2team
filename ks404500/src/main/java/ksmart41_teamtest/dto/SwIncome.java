package ksmart41_teamtest.dto;

public class SwIncome {
	private String swIncomeCode;
	private String contractManageCode;
	private String swIsCode;
	private String memberIdFinish;
	private String invoiceCode;
	private String memberId;
	private String swGroupSlip;
	private String swSlipNumber;
	private String swIsName;
	private String swIncomeInfo;
	private String swIncomeRegDate;
	private String swIncomeFinish;
	private String swIncomeFinishDate;
	private String paymentCheckCode;
	private String paymentCode;
	private String clientId;
	private String paymentStateCode;
	private String paymentEstimate;
	private String paymentCharge;
	private String paymentBalance;
	private String paymentType;
	private String paymentDate;
	private String slipNumber;
	private String serviceRequestDate;
	
	public String getSlipNumber() {
		return slipNumber;
	}
	public void setSlipNumber(String slipNumber) {
		this.slipNumber = slipNumber;
	}
	public String getServiceRequestDate() {
		return serviceRequestDate;
	}
	public void setServiceRequestDate(String serviceRequestDate) {
		this.serviceRequestDate = serviceRequestDate;
	}
	public String getSwIncomeCode() {
		return swIncomeCode;
	}
	public void setSwIncomeCode(String swIncomeCode) {
		this.swIncomeCode = swIncomeCode;
	}
	public String getContractManageCode() {
		return contractManageCode;
	}
	public void setContractManageCode(String contractManageCode) {
		this.contractManageCode = contractManageCode;
	}
	public String getSwIsCode() {
		return swIsCode;
	}
	public void setSwIsCode(String swIsCode) {
		this.swIsCode = swIsCode;
	}
	public String getMemberIdFinish() {
		return memberIdFinish;
	}
	public void setMemberIdFinish(String memberIdFinish) {
		this.memberIdFinish = memberIdFinish;
	}
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getSwGroupSlip() {
		return swGroupSlip;
	}
	public void setSwGroupSlip(String swGroupSlip) {
		this.swGroupSlip = swGroupSlip;
	}
	public String getSwSlipNumber() {
		return swSlipNumber;
	}
	public void setSwSlipNumber(String swSlipNumber) {
		this.swSlipNumber = swSlipNumber;
	}
	public String getSwIsName() {
		return swIsName;
	}
	public void setSwIsName(String swIsName) {
		this.swIsName = swIsName;
	}
	public String getSwIncomeInfo() {
		return swIncomeInfo;
	}
	public void setSwIncomeInfo(String swIncomeInfo) {
		this.swIncomeInfo = swIncomeInfo;
	}
	public String getSwIncomeRegDate() {
		return swIncomeRegDate;
	}
	public void setSwIncomeRegDate(String swIncomeRegDate) {
		this.swIncomeRegDate = swIncomeRegDate;
	}
	public String getSwIncomeFinish() {
		return swIncomeFinish;
	}
	public void setSwIncomeFinish(String swIncomeFinish) {
		this.swIncomeFinish = swIncomeFinish;
	}
	public String getSwIncomeFinishDate() {
		return swIncomeFinishDate;
	}
	public void setSwIncomeFinishDate(String swIncomeFinishDate) {
		this.swIncomeFinishDate = swIncomeFinishDate;
	}
	public String getPaymentCheckCode() {
		return paymentCheckCode;
	}
	public void setPaymentCheckCode(String paymentCheckCode) {
		this.paymentCheckCode = paymentCheckCode;
	}
	public String getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getPaymentStateCode() {
		return paymentStateCode;
	}
	public void setPaymentStateCode(String paymentStateCode) {
		this.paymentStateCode = paymentStateCode;
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
		builder.append("SwIncome [swIncomeCode=");
		builder.append(swIncomeCode);
		builder.append(", contractManageCode=");
		builder.append(contractManageCode);
		builder.append(", swIsCode=");
		builder.append(swIsCode);
		builder.append(", memberIdFinish=");
		builder.append(memberIdFinish);
		builder.append(", invoiceCode=");
		builder.append(invoiceCode);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", swGroupSlip=");
		builder.append(swGroupSlip);
		builder.append(", swSlipNumber=");
		builder.append(swSlipNumber);
		builder.append(", swIsName=");
		builder.append(swIsName);
		builder.append(", swIncomeInfo=");
		builder.append(swIncomeInfo);
		builder.append(", swIncomeRegDate=");
		builder.append(swIncomeRegDate);
		builder.append(", swIncomeFinish=");
		builder.append(swIncomeFinish);
		builder.append(", swIncomeFinishDate=");
		builder.append(swIncomeFinishDate);
		builder.append(", paymentCheckCode=");
		builder.append(paymentCheckCode);
		builder.append(", paymentCode=");
		builder.append(paymentCode);
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", paymentStateCode=");
		builder.append(paymentStateCode);
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
		builder.append(", slipNumber=");
		builder.append(slipNumber);
		builder.append(", serviceRequestDate=");
		builder.append(serviceRequestDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
