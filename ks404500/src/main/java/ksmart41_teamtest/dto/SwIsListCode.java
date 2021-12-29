package ksmart41_teamtest.dto;

public class SwIsListCode {
	private String swIsCode;
	private String swIsName;
	private String swIsGroupCode;
	private String mainBusinessCode;
	private String swIsUse;
	private String swIsAmend;
	private String swIsRegDate;
	private String memberId;
	private String swIsYear;
	public String getSwIsCode() {
		return swIsCode;
	}
	public void setSwIsCode(String swIsCode) {
		this.swIsCode = swIsCode;
	}
	public String getSwIsName() {
		return swIsName;
	}
	public void setSwIsName(String swIsName) {
		this.swIsName = swIsName;
	}
	public String getSwIsGroupCode() {
		return swIsGroupCode;
	}
	public void setSwIsGroupCode(String swIsGroupCode) {
		this.swIsGroupCode = swIsGroupCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getSwIsUse() {
		return swIsUse;
	}
	public void setSwIsUse(String swIsUse) {
		this.swIsUse = swIsUse;
	}
	public String getSwIsAmend() {
		return swIsAmend;
	}
	public void setSwIsAmend(String swIsAmend) {
		this.swIsAmend = swIsAmend;
	}
	public String getSwIsRegDate() {
		return swIsRegDate;
	}
	public void setSwIsRegDate(String swIsRegDate) {
		this.swIsRegDate = swIsRegDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getSwIsYear() {
		return swIsYear;
	}
	public void setSwIsYear(String swIsYear) {
		this.swIsYear = swIsYear;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SwIsListCode [swIsCode=");
		builder.append(swIsCode);
		builder.append(", swIsName=");
		builder.append(swIsName);
		builder.append(", swIsGroupCode=");
		builder.append(swIsGroupCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", swIsUse=");
		builder.append(swIsUse);
		builder.append(", swIsAmend=");
		builder.append(swIsAmend);
		builder.append(", swIsRegDate=");
		builder.append(swIsRegDate);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", swIsYear=");
		builder.append(swIsYear);
		builder.append("]");
		return builder.toString();
	}
	
	
}
