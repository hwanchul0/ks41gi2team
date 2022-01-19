package ksmart41_teamtest.dto;

// 유성 쇼핑몰 결제등록
public class ShopAddPaymentCheck {
	private String addPcCode;
	private String shopPaymentCheckCode;
	private String shopConsumerId;
	private String shopMemberId;
	private String paymentStateCode;
	private String shopPaymentCode;
	private String shopPaymentCharge;
	private String shopPaymentBalance;
	private String paymentType;
	private String shopPaymentDate;
	public String getAddPcCode() {
		return addPcCode;
	}
	public void setAddPcCode(String addPcCode) {
		this.addPcCode = addPcCode;
	}
	public String getShopPaymentCheckCode() {
		return shopPaymentCheckCode;
	}
	public void setShopPaymentCheckCode(String shopPaymentCheckCode) {
		this.shopPaymentCheckCode = shopPaymentCheckCode;
	}
	public String getShopConsumerId() {
		return shopConsumerId;
	}
	public void setShopConsumerId(String shopConsumerId) {
		this.shopConsumerId = shopConsumerId;
	}
	public String getShopMemberId() {
		return shopMemberId;
	}
	public void setShopMemberId(String shopMemberId) {
		this.shopMemberId = shopMemberId;
	}
	public String getPaymentStateCode() {
		return paymentStateCode;
	}
	public void setPaymentStateCode(String paymentStateCode) {
		this.paymentStateCode = paymentStateCode;
	}
	public String getShopPaymentCode() {
		return shopPaymentCode;
	}
	public void setShopPaymentCode(String shopPaymentCode) {
		this.shopPaymentCode = shopPaymentCode;
	}
	public String getShopPaymentCharge() {
		return shopPaymentCharge;
	}
	public void setShopPaymentCharge(String shopPaymentCharge) {
		this.shopPaymentCharge = shopPaymentCharge;
	}
	public String getShopPaymentBalance() {
		return shopPaymentBalance;
	}
	public void setShopPaymentBalance(String shopPaymentBalance) {
		this.shopPaymentBalance = shopPaymentBalance;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getShopPaymentDate() {
		return shopPaymentDate;
	}
	public void setShopPaymentDate(String shopPaymentDate) {
		this.shopPaymentDate = shopPaymentDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopAddPaymentCheck [addPcCode=");
		builder.append(addPcCode);
		builder.append(", shopPaymentCheckCode=");
		builder.append(shopPaymentCheckCode);
		builder.append(", shopConsumerId=");
		builder.append(shopConsumerId);
		builder.append(", shopMemberId=");
		builder.append(shopMemberId);
		builder.append(", paymentStateCode=");
		builder.append(paymentStateCode);
		builder.append(", shopPaymentCode=");
		builder.append(shopPaymentCode);
		builder.append(", shopPaymentCharge=");
		builder.append(shopPaymentCharge);
		builder.append(", shopPaymentBalance=");
		builder.append(shopPaymentBalance);
		builder.append(", paymentType=");
		builder.append(paymentType);
		builder.append(", shopPaymentDate=");
		builder.append(shopPaymentDate);
		builder.append("]");
		return builder.toString();
	}


}
