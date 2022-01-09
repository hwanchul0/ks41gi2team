package ksmart41_teamtest.dto;

public class ShopMember {

	private String shopMemberId;
	private String businessLevelCode;
	private String shopMemberPw;
	private String shopMemberName;
	private String shopMemberAddr;
	private String shopMemberEmail;
	private String shopMemberPhone;
	private String shopMemberState;
	private String shopWithdrawalReason;
	private String shopWithdrawalDate;
	private String shopMemberReg;
	
	public String getShopMemberId() {
		return shopMemberId;
	}
	public void setShopMemberId(String shopMemberId) {
		this.shopMemberId = shopMemberId;
	}
	public String getBusinessLevelCode() {
		return businessLevelCode;
	}
	public void setBusinessLevelCode(String businessLevelCode) {
		this.businessLevelCode = businessLevelCode;
	}
	public String getShopMemberPw() {
		return shopMemberPw;
	}
	public void setShopMemberPw(String shopMemberPw) {
		this.shopMemberPw = shopMemberPw;
	}
	public String getShopMemberName() {
		return shopMemberName;
	}
	public void setShopMemberName(String shopMemberName) {
		this.shopMemberName = shopMemberName;
	}
	public String getShopMemberAddr() {
		return shopMemberAddr;
	}
	public void setShopMemberAddr(String shopMemberAddr) {
		this.shopMemberAddr = shopMemberAddr;
	}
	public String getShopMemberEmail() {
		return shopMemberEmail;
	}
	public void setShopMemberEmail(String shopMemberEmail) {
		this.shopMemberEmail = shopMemberEmail;
	}
	public String getShopMemberPhone() {
		return shopMemberPhone;
	}
	public void setShopMemberPhone(String shopMemberPhone) {
		this.shopMemberPhone = shopMemberPhone;
	}
	public String getShopMemberState() {
		return shopMemberState;
	}
	public void setShopMemberState(String shopMemberState) {
		this.shopMemberState = shopMemberState;
	}
	public String getShopWithdrawalReason() {
		return shopWithdrawalReason;
	}
	public void setShopWithdrawalReason(String shopWithdrawalReason) {
		this.shopWithdrawalReason = shopWithdrawalReason;
	}
	public String getShopWithdrawalDate() {
		return shopWithdrawalDate;
	}
	public void setShopWithdrawalDate(String shopWithdrawalDate) {
		this.shopWithdrawalDate = shopWithdrawalDate;
	}
	public String getShopMemberReg() {
		return shopMemberReg;
	}
	public void setShopMemberReg(String shopMemberReg) {
		this.shopMemberReg = shopMemberReg;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopMember [shopMemberId=");
		builder.append(shopMemberId);
		builder.append(", businessLevelCode=");
		builder.append(businessLevelCode);
		builder.append(", shopMemberPw=");
		builder.append(shopMemberPw);
		builder.append(", shopMemberName=");
		builder.append(shopMemberName);
		builder.append(", shopMemberAddr=");
		builder.append(shopMemberAddr);
		builder.append(", shopMemberEmail=");
		builder.append(shopMemberEmail);
		builder.append(", shopMemberPhone=");
		builder.append(shopMemberPhone);
		builder.append(", shopMemberState=");
		builder.append(shopMemberState);
		builder.append(", shopWithdrawalReason=");
		builder.append(shopWithdrawalReason);
		builder.append(", shopWithdrawalDate=");
		builder.append(shopWithdrawalDate);
		builder.append(", shopMemberReg=");
		builder.append(shopMemberReg);
		builder.append("]");
		return builder.toString();
	}
	
}
