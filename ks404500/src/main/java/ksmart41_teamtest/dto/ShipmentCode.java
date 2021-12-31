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
		return "ShipmentCode [shopOrderCode=" + shopOrderCode + ", shopConsumerId=" + shopConsumerId + ", shopMemberId="
				+ shopMemberId + ", releaseDate=" + releaseDate + ", shopDeliveryLocation=" + shopDeliveryLocation
				+ ", shopShipmentName=" + shopShipmentName + ", shopOrderRegDate=" + shopOrderRegDate + "]";
	}
	
	
}
