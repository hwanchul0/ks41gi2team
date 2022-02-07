package ksmart41_teamtest.dto;

public class Member {
	private String memberId;
	private String memberLevelCode;
	private String memberPw;
	private String memberName;
	private String memberAddr;
	private String memberEmail;
	private String memberPhone;
	private String memberRegDate;
	private String memberStatus;
	private String memberWithdrawal;
	private String memberWithdrawalReason;
	private String memberProfile;
	private String memberfileName;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberLevelCode() {
		return memberLevelCode;
	}
	public void setMemberLevelCode(String memberLevelCode) {
		this.memberLevelCode = memberLevelCode;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(String memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public String getMemberWithdrawal() {
		return memberWithdrawal;
	}
	public void setMemberWithdrawal(String memberWithdrawal) {
		this.memberWithdrawal = memberWithdrawal;
	}
	public String getMemberWithdrawalReason() {
		return memberWithdrawalReason;
	}
	public void setMemberWithdrawalReason(String memberWithdrawalReason) {
		this.memberWithdrawalReason = memberWithdrawalReason;
	}
	public String getMemberProfile() {
		return memberProfile;
	}
	public void setMemberProfile(String memberProfile) {
		this.memberProfile = memberProfile;
	}
	public String getMemberfileName() {
		return memberfileName;
	}
	public void setMemberfileName(String memberfileName) {
		this.memberfileName = memberfileName;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberLevelCode=" + memberLevelCode + ", memberPw=" + memberPw
				+ ", memberName=" + memberName + ", memberAddr=" + memberAddr + ", memberEmail=" + memberEmail
				+ ", memberPhone=" + memberPhone + ", memberRegDate=" + memberRegDate + ", memberStatus=" + memberStatus
				+ ", memberWithdrawal=" + memberWithdrawal + ", memberWithdrawalReason=" + memberWithdrawalReason
				+ ", memberProfile=" + memberProfile + ", memberfileName=" + memberfileName + "]";
	}
	
	
}
