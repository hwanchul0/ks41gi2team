package ksmart41_teamtest.dto;

public class MemberLevel {

	private String memberLevelCode;
	private String memberLevelName;
	private String memberLevelUpdateDate;
	public String getMemberLevelCode() {
		return memberLevelCode;
	}
	public void setMemberLevelCode(String memberLevelCode) {
		this.memberLevelCode = memberLevelCode;
	}
	public String getMemberLevelName() {
		return memberLevelName;
	}
	public void setMemberLevelName(String memberLevelName) {
		this.memberLevelName = memberLevelName;
	}
	public String getMemberLevelUpdateDate() {
		return memberLevelUpdateDate;
	}
	public void setMemberLevelUpdateDate(String memberLevelUpdateDate) {
		this.memberLevelUpdateDate = memberLevelUpdateDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberLevel [memberLevelCode=");
		builder.append(memberLevelCode);
		builder.append(", memberLevelName=");
		builder.append(memberLevelName);
		builder.append(", memberLevelUpdateDate=");
		builder.append(memberLevelUpdateDate);
		builder.append("]");
		return builder.toString();
	}
}
