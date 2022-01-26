package ksmart41_teamtest.dto;

public class ShopRequestShipment {
	private String shopOrderCode;
	private String assortCode;
	private String mainBusinessCode;
	private String shopConsumerId;
	private String shopOrderAmount;
	private String shopDeliveryLocation;
	private String stockAmount;
	private String stockSchedule;
	private String stockPossible;
	private String stockPrice;
	private String goodsName;
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
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getShopConsumerId() {
		return shopConsumerId;
	}
	public void setShopConsumerId(String shopConsumerId) {
		this.shopConsumerId = shopConsumerId;
	}
	public String getShopOrderAmount() {
		return shopOrderAmount;
	}
	public void setShopOrderAmount(String shopOrderAmount) {
		this.shopOrderAmount = shopOrderAmount;
	}
	public String getShopDeliveryLocation() {
		return shopDeliveryLocation;
	}
	public void setShopDeliveryLocation(String shopDeliveryLocation) {
		this.shopDeliveryLocation = shopDeliveryLocation;
	}
	public String getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(String stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getStockSchedule() {
		return stockSchedule;
	}
	public void setStockSchedule(String stockSchedule) {
		this.stockSchedule = stockSchedule;
	}
	public String getStockPossible() {
		return stockPossible;
	}
	public void setStockPossible(String stockPossible) {
		this.stockPossible = stockPossible;
	}
	public String getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopRequestShipment [shopOrderCode=");
		builder.append(shopOrderCode);
		builder.append(", assortCode=");
		builder.append(assortCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", shopConsumerId=");
		builder.append(shopConsumerId);
		builder.append(", shopOrderAmount=");
		builder.append(shopOrderAmount);
		builder.append(", shopDeliveryLocation=");
		builder.append(shopDeliveryLocation);
		builder.append(", stockAmount=");
		builder.append(stockAmount);
		builder.append(", stockSchedule=");
		builder.append(stockSchedule);
		builder.append(", stockPossible=");
		builder.append(stockPossible);
		builder.append(", stockPrice=");
		builder.append(stockPrice);
		builder.append(", goodsName=");
		builder.append(goodsName);
		builder.append("]");
		return builder.toString();
	}
	
}
