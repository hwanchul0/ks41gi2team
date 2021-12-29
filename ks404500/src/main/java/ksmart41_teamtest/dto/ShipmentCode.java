package ksmart41_teamtest.dto;

public class ShipmentCode {
	private String shopShipmentCode;
	private String shopShipmentSequence;
	private String shopShipmentName;
	public String getShopShipmentCode() {
		return shopShipmentCode;
	}
	public void setShopShipmentCode(String shopShipmentCode) {
		this.shopShipmentCode = shopShipmentCode;
	}
	public String getShopShipmentSequence() {
		return shopShipmentSequence;
	}
	public void setShopShipmentSequence(String shopShipmentSequence) {
		this.shopShipmentSequence = shopShipmentSequence;
	}
	public String getShopShipmentName() {
		return shopShipmentName;
	}
	public void setShopShipmentName(String shopShipmentName) {
		this.shopShipmentName = shopShipmentName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShipmentCode [shopShipmentCode=");
		builder.append(shopShipmentCode);
		builder.append(", shopShipmentSequence=");
		builder.append(shopShipmentSequence);
		builder.append(", shopShipmentName=");
		builder.append(shopShipmentName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
