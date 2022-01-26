package ksmart41_teamtest.dto;

//쇼핑몰 - 배송조회
public class ShipmentCode {
	private String shopOrderCode;
	private String shopConsumerId;
	private String shopMemberId;
	private String releaseDate;
	private String shopDeliveryLocation;
	private String shopShipmentName;
	private String shopOrderRegDate;
	private String releaseCode;
	private String mainBusinessCode;
	private String shopShipmentCode;
	private String shopPaymentCheckCode;

	
	
	public String getReleaseCode() {
		return releaseCode;
	}
	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getShopShipmentCode() {
		return shopShipmentCode;
	}
	public void setShopShipmentCode(String shopShipmentCode) {
		this.shopShipmentCode = shopShipmentCode;
	}
	public String getShopPaymentCheckCode() {
		return shopPaymentCheckCode;
	}
	public void setShopPaymentCheckCode(String shopPaymentCheckCode) {
		this.shopPaymentCheckCode = shopPaymentCheckCode;
	}
	public String getShopOrderCode() {
		return shopOrderCode;
	}
	public void setShopOrderCode(String shopOrderCode) {
		this.shopOrderCode = shopOrderCode;
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
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getShopDeliveryLocation() {
		return shopDeliveryLocation;
	}
	public void setShopDeliveryLocation(String shopDeliveryLocation) {
		this.shopDeliveryLocation = shopDeliveryLocation;
	}
	public String getShopShipmentName() {
		return shopShipmentName;
	}
	public void setShopShipmentName(String shopShipmentName) {
		this.shopShipmentName = shopShipmentName;
	}
	public String getShopOrderRegDate() {
		return shopOrderRegDate;
	}
	public void setShopOrderRegDate(String shopOrderRegDate) {
		this.shopOrderRegDate = shopOrderRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShipmentCode [shopOrderCode=");
		builder.append(shopOrderCode);
		builder.append(", shopConsumerId=");
		builder.append(shopConsumerId);
		builder.append(", shopMemberId=");
		builder.append(shopMemberId);
		builder.append(", releaseDate=");
		builder.append(releaseDate);
		builder.append(", shopDeliveryLocation=");
		builder.append(shopDeliveryLocation);
		builder.append(", shopShipmentName=");
		builder.append(shopShipmentName);
		builder.append(", shopOrderRegDate=");
		builder.append(shopOrderRegDate);
		builder.append(", releaseCode=");
		builder.append(releaseCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", shopShipmentCode=");
		builder.append(shopShipmentCode);
		builder.append(", shopPaymentCheckCode=");
		builder.append(shopPaymentCheckCode);
		builder.append("]");
		return builder.toString();
	}
	
	
}
