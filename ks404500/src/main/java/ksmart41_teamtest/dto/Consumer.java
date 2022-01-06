package ksmart41_teamtest.dto;

public class Consumer {
	private String shopConsumerId;
	private String shopConsumerName;
	private String shopConsumerPw;
	private String shopConsumerAddr;
	private String shopConsumerEmail;
	private String shopConsumerPhone;
	private String shopConsumerReg;
	private String shopConsumerState;
	private String shopConsumerwithdrawalReason;
	private String shopConsumerwithdrawalDate;
	public String getShopConsumerId() {
		return shopConsumerId;
	}
	public void setShopConsumerId(String shopConsumerId) {
		this.shopConsumerId = shopConsumerId;
	}
	public String getShopConsumerName() {
		return shopConsumerName;
	}
	public void setShopConsumerName(String shopConsumerName) {
		this.shopConsumerName = shopConsumerName;
	}
	public String getShopConsumerPw() {
		return shopConsumerPw;
	}
	public void setShopConsumerPw(String shopConsumerPw) {
		this.shopConsumerPw = shopConsumerPw;
	}
	public String getShopConsumerAddr() {
		return shopConsumerAddr;
	}
	public void setShopConsumerAddr(String shopConsumerAddr) {
		this.shopConsumerAddr = shopConsumerAddr;
	}
	public String getShopConsumerEmail() {
		return shopConsumerEmail;
	}
	public void setShopConsumerEmail(String shopConsumerEmail) {
		this.shopConsumerEmail = shopConsumerEmail;
	}
	public String getShopConsumerPhone() {
		return shopConsumerPhone;
	}
	public void setShopConsumerPhone(String shopConsumerPhone) {
		this.shopConsumerPhone = shopConsumerPhone;
	}
	public String getShopConsumerReg() {
		return shopConsumerReg;
	}
	public void setShopConsumerReg(String shopConsumerReg) {
		this.shopConsumerReg = shopConsumerReg;
	}
	public String getShopConsumerState() {
		return shopConsumerState;
	}
	public void setShopConsumerState(String shopConsumerState) {
		this.shopConsumerState = shopConsumerState;
	}
	public String getShopConsumerwithdrawalReason() {
		return shopConsumerwithdrawalReason;
	}
	public void setShopConsumerwithdrawalReason(String shopConsumerwithdrawalReason) {
		this.shopConsumerwithdrawalReason = shopConsumerwithdrawalReason;
	}
	public String getShopConsumerwithdrawalDate() {
		return shopConsumerwithdrawalDate;
	}
	public void setShopConsumerwithdrawalDate(String shopConsumerwithdrawalDate) {
		this.shopConsumerwithdrawalDate = shopConsumerwithdrawalDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consumer [shopConsumerId=");
		builder.append(shopConsumerId);
		builder.append(", shopConsumerName=");
		builder.append(shopConsumerName);
		builder.append(", shopConsumerPw=");
		builder.append(shopConsumerPw);
		builder.append(", shopConsumerAddr=");
		builder.append(shopConsumerAddr);
		builder.append(", shopConsumerEmail=");
		builder.append(shopConsumerEmail);
		builder.append(", shopConsumerPhone=");
		builder.append(shopConsumerPhone);
		builder.append(", shopConsumerReg=");
		builder.append(shopConsumerReg);
		builder.append(", shopConsumerState=");
		builder.append(shopConsumerState);
		builder.append(", shopConsumerwithdrawalReason=");
		builder.append(shopConsumerwithdrawalReason);
		builder.append(", shopConsumerwithdrawalDate=");
		builder.append(shopConsumerwithdrawalDate);
		builder.append("]");
		return builder.toString();
	}
}
