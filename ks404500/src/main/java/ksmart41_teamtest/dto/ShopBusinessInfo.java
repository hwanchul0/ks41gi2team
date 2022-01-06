package ksmart41_teamtest.dto;

public class ShopBusinessInfo {
	
	private String shopClientCode;
	private String mainBusinessCode;
	private String shopClientBusinessName;
	private String shopClientBusinessPhone;
	private String shopClientBusinessStaff;
	private String shopClientBizLeaderName;
	private String shopClientBusinessNumber;
	private String shopClientBusinessAddr;
	private String shopClientBusinessType1;
	private String shopClientBusinessType2;
	private String shopClientBusinessRegDate;
	
	public String getShopClientCode() {
		return shopClientCode;
	}
	public void setShopClientCode(String shopClientCode) {
		this.shopClientCode = shopClientCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getShopClientBusinessName() {
		return shopClientBusinessName;
	}
	public void setShopClientBusinessName(String shopClientBusinessName) {
		this.shopClientBusinessName = shopClientBusinessName;
	}
	public String getShopClientBusinessPhone() {
		return shopClientBusinessPhone;
	}
	public void setShopClientBusinessPhone(String shopClientBusinessPhone) {
		this.shopClientBusinessPhone = shopClientBusinessPhone;
	}
	public String getShopClientBusinessStaff() {
		return shopClientBusinessStaff;
	}
	public void setShopClientBusinessStaff(String shopClientBusinessStaff) {
		this.shopClientBusinessStaff = shopClientBusinessStaff;
	}
	public String getShopClientBizLeaderName() {
		return shopClientBizLeaderName;
	}
	public void setShopClientBizLeaderName(String shopClientBizLeaderName) {
		this.shopClientBizLeaderName = shopClientBizLeaderName;
	}
	public String getShopClientBusinessNumber() {
		return shopClientBusinessNumber;
	}
	public void setShopClientBusinessNumber(String shopClientBusinessNumber) {
		this.shopClientBusinessNumber = shopClientBusinessNumber;
	}
	public String getShopClientBusinessAddr() {
		return shopClientBusinessAddr;
	}
	public void setShopClientBusinessAddr(String shopClientBusinessAddr) {
		this.shopClientBusinessAddr = shopClientBusinessAddr;
	}
	public String getShopClientBusinessType1() {
		return shopClientBusinessType1;
	}
	public void setShopClientBusinessType1(String shopClientBusinessType1) {
		this.shopClientBusinessType1 = shopClientBusinessType1;
	}
	public String getShopClientBusinessType2() {
		return shopClientBusinessType2;
	}
	public void setShopClientBusinessType2(String shopClientBusinessType2) {
		this.shopClientBusinessType2 = shopClientBusinessType2;
	}
	public String getShopClientBusinessRegDate() {
		return shopClientBusinessRegDate;
	}
	public void setShopClientBusinessRegDate(String shopClientBusinessRegDate) {
		this.shopClientBusinessRegDate = shopClientBusinessRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopBusinessInfo [shopClientCode=");
		builder.append(shopClientCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", shopClientBusinessName=");
		builder.append(shopClientBusinessName);
		builder.append(", shopClientBusinessPhone=");
		builder.append(shopClientBusinessPhone);
		builder.append(", shopClientBusinessStaff=");
		builder.append(shopClientBusinessStaff);
		builder.append(", shopClientBizLeaderName=");
		builder.append(shopClientBizLeaderName);
		builder.append(", shopClientBusinessNumber=");
		builder.append(shopClientBusinessNumber);
		builder.append(", shopClientBusinessAddr=");
		builder.append(shopClientBusinessAddr);
		builder.append(", shopClientBusinessType1=");
		builder.append(shopClientBusinessType1);
		builder.append(", shopClientBusinessType2=");
		builder.append(shopClientBusinessType2);
		builder.append(", shopClientBusinessRegDate=");
		builder.append(shopClientBusinessRegDate);
		builder.append("]");
		return builder.toString();
	}
}
