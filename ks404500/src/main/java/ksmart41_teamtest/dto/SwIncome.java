package ksmart41_teamtest.dto;

import java.util.Date;

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
		builder.append("]");
		return builder.toString();
	}
	
}
