package ksmart41_teamtest.dto;



public class ShopIsListCode {
	//유경 - 쇼핑몰 계정과목목록
	private String shopIsCode;
	private String shopIsName;
	private String shopIsGroupCode;
	private String mainBusinessCode;
	private String shopIsUse;
	private String shopIsAmend;
	private String shopIsRegDate;
	private String shopMemberId;
	private String shopIsYear;
	public String getShopIsCode() {
		return shopIsCode;
	}
	public void setShopIsCode(String shopIsCode) {
		this.shopIsCode = shopIsCode;
	}
	public String getShopIsName() {
		return shopIsName;
	}
	public void setShopIsName(String shopIsName) {
		this.shopIsName = shopIsName;
	}
	public String getShopIsGroupCode() {
		return shopIsGroupCode;
	}
	public void setShopIsGroupCode(String shopIsGroupCode) {
		this.shopIsGroupCode = shopIsGroupCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getShopIsUse() {
		return shopIsUse;
	}
	public void setShopIsUse(String shopIsUse) {
		this.shopIsUse = shopIsUse;
	}
	public String getShopIsAmend() {
		return shopIsAmend;
	}
	public void setShopIsAmend(String shopIsAmend) {
		this.shopIsAmend = shopIsAmend;
	}
	public String getShopIsRegDate() {
		return shopIsRegDate;
	}
	public void setShopIsRegDate(String shopIsRegDate) {
		this.shopIsRegDate = shopIsRegDate;
	}
	public String getShopMemberId() {
		return shopMemberId;
	}
	public void setShopMemberId(String shopMemberId) {
		this.shopMemberId = shopMemberId;
	}
	public String getShopIsYear() {
		return shopIsYear;
	}
	public void setShopIsYear(String shopIsYear) {
		this.shopIsYear = shopIsYear;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopIsListCode [shopIsCode=");
		builder.append(shopIsCode);
		builder.append(", shopIsName=");
		builder.append(shopIsName);
		builder.append(", shopIsGroupCode=");
		builder.append(shopIsGroupCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", shopIsUse=");
		builder.append(shopIsUse);
		builder.append(", shopIsAmend=");
		builder.append(shopIsAmend);
		builder.append(", shopIsRegDate=");
		builder.append(shopIsRegDate);
		builder.append(", shopMemberId=");
		builder.append(shopMemberId);
		builder.append(", shopIsYear=");
		builder.append(shopIsYear);
		builder.append("]");
		return builder.toString();
	}
	
	
}
