package ksmart41_teamtest.dto;

public class SwExpense {

	private String swExpensePayCode;
	private String swIsCode;
	private String memberIdFinish;
	private String memberId;
	private String swSlipNumber;
	private String swGroupSlip;
	private String swIsName;
	private String swExpenseInfo;
	private int swExpensePrice;
	private String swExpenseRegDate;
	private String swExpenseFinish;
	private String swExpenseFinishDate;
	public String getSwExpensePayCode() {
		return swExpensePayCode;
	}
	public void setSwExpensePayCode(String swExpensePayCode) {
		this.swExpensePayCode = swExpensePayCode;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getSwSlipNumber() {
		return swSlipNumber;
	}
	public void setSwSlipNumber(String swSlipNumber) {
		this.swSlipNumber = swSlipNumber;
	}
	public String getSwGroupSlip() {
		return swGroupSlip;
	}
	public void setSwGroupSlip(String swGroupSlip) {
		this.swGroupSlip = swGroupSlip;
	}
	public String getSwIsName() {
		return swIsName;
	}
	public void setSwIsName(String swIsName) {
		this.swIsName = swIsName;
	}
	public String getSwExpenseInfo() {
		return swExpenseInfo;
	}
	public void setSwExpenseInfo(String swExpenseInfo) {
		this.swExpenseInfo = swExpenseInfo;
	}
	public int getSwExpensePrice() {
		return swExpensePrice;
	}
	public void setSwExpensePrice(int swExpensePrice) {
		this.swExpensePrice = swExpensePrice;
	}
	public String getSwExpenseRegDate() {
		return swExpenseRegDate;
	}
	public void setSwExpenseRegDate(String swExpenseRegDate) {
		this.swExpenseRegDate = swExpenseRegDate;
	}
	public String getSwExpenseFinish() {
		return swExpenseFinish;
	}
	public void setSwExpenseFinish(String swExpenseFinish) {
		this.swExpenseFinish = swExpenseFinish;
	}
	public String getSwExpenseFinishDate() {
		return swExpenseFinishDate;
	}
	public void setSwExpenseFinishDate(String swExpenseFinishDate) {
		this.swExpenseFinishDate = swExpenseFinishDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SwExpense [swExpensePayCode=");
		builder.append(swExpensePayCode);
		builder.append(", swIsCode=");
		builder.append(swIsCode);
		builder.append(", memberIdFinish=");
		builder.append(memberIdFinish);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", swSlipNumber=");
		builder.append(swSlipNumber);
		builder.append(", swGroupSlip=");
		builder.append(swGroupSlip);
		builder.append(", swIsName=");
		builder.append(swIsName);
		builder.append(", swExpenseInfo=");
		builder.append(swExpenseInfo);
		builder.append(", swExpensePrice=");
		builder.append(swExpensePrice);
		builder.append(", swExpenseRegDate=");
		builder.append(swExpenseRegDate);
		builder.append(", swExpenseFinish=");
		builder.append(swExpenseFinish);
		builder.append(", swExpenseFinishDate=");
		builder.append(swExpenseFinishDate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
