package ksmart41_teamtest.dto;

public class Order {
	private String shopOrderCode;
	private String assortCode;
	private String shopConsumerId;
	private String shopMemberId;
	private String shopSlipNumber;
	private String shopOrderAmount;
	private String goodsPaymentAmount;
	private String shopDeliveryLocation;
	private String shopCustomerPhone;
	private String shopOrderRegDate;
	private String shopOrderCancleDate;
	public String getShopOrderCode() {
		return shopOrderCode;
	}
	public void setShopOrderCode(String shopOrderCode) {
		this.shopOrderCode = shopOrderCode;
	}
	public String getAssortCode() {
		return assortCode;
	}
	public void setAssortCode(String assortCode) {
		this.assortCode = assortCode;
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
	public String getShopSlipNumber() {
		return shopSlipNumber;
	}
	public void setShopSlipNumber(String shopSlipNumber) {
		this.shopSlipNumber = shopSlipNumber;
	}
	public String getShopOrderAmount() {
		return shopOrderAmount;
	}
	public void setShopOrderAmount(String shopOrderAmount) {
		this.shopOrderAmount = shopOrderAmount;
	}
	public String getGoodsPaymentAmount() {
		return goodsPaymentAmount;
	}
	public void setGoodsPaymentAmount(String goodsPaymentAmount) {
		this.goodsPaymentAmount = goodsPaymentAmount;
	}
	public String getShopDeliveryLocation() {
		return shopDeliveryLocation;
	}
	public void setShopDeliveryLocation(String shopDeliveryLocation) {
		this.shopDeliveryLocation = shopDeliveryLocation;
	}
	public String getShopCustomerPhone() {
		return shopCustomerPhone;
	}
	public void setShopCustomerPhone(String shopCustomerPhone) {
		this.shopCustomerPhone = shopCustomerPhone;
	}
	public String getShopOrderRegDate() {
		return shopOrderRegDate;
	}
	public void setShopOrderRegDate(String shopOrderRegDate) {
		this.shopOrderRegDate = shopOrderRegDate;
	}
	public String getShopOrderCancleDate() {
		return shopOrderCancleDate;
	}
	public void setShopOrderCancleDate(String shopOrderCancleDate) {
		this.shopOrderCancleDate = shopOrderCancleDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [shopOrderCode=");
		builder.append(shopOrderCode);
		builder.append(", assortCode=");
		builder.append(assortCode);
		builder.append(", shopConsumerId=");
		builder.append(shopConsumerId);
		builder.append(", shopMemberId=");
		builder.append(shopMemberId);
		builder.append(", shopSlipNumber=");
		builder.append(shopSlipNumber);
		builder.append(", shopOrderAmount=");
		builder.append(shopOrderAmount);
		builder.append(", goodsPaymentAmount=");
		builder.append(goodsPaymentAmount);
		builder.append(", shopDeliveryLocation=");
		builder.append(shopDeliveryLocation);
		builder.append(", shopCustomerPhone=");
		builder.append(shopCustomerPhone);
		builder.append(", shopOrderRegDate=");
		builder.append(shopOrderRegDate);
		builder.append(", shopOrderCancleDate=");
		builder.append(shopOrderCancleDate);
		builder.append("]");
		return builder.toString();
	}
}
