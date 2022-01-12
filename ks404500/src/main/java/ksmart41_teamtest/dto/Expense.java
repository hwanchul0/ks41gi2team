package ksmart41_teamtest.dto;

public class Expense {
	
	private String shopExpenseCode;
	private String shopIsCode;
	private String shopClientCode;
	private String shopMemberId;
	private String shopMemberIdFinish;
	private String shopIsName;
	private String shopExpenseDate;
	private String shopExpenseInfo;
	private String shopExpensePrice;
	private String shopExpenseRegDate;
	private String shopExpenseFinish;
	private String shopExpenseFinishDate;
	private String shopExpenseSlipNumber;
	private String shopExpenseGroupSlip;
	
	//차트생성 
	private String mon; // 월
	private String chartPrice;// 월 합계 
	
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public String getChartPrice() {
		return chartPrice;
	}
	public void setChartPrice(String chartPrice) {
		this.chartPrice = chartPrice;
	}
	public String getShopExpenseCode() {
		return shopExpenseCode;
	}
	public void setShopExpenseCode(String shopExpenseCode) {
		this.shopExpenseCode = shopExpenseCode;
	}
	public String getShopIsCode() {
		return shopIsCode;
	}
	public void setShopIsCode(String shopIsCode) {
		this.shopIsCode = shopIsCode;
	}
	public String getShopClientCode() {
		return shopClientCode;
	}
	public void setShopClientCode(String shopClientCode) {
		this.shopClientCode = shopClientCode;
	}
	public String getShopMemberId() {
		return shopMemberId;
	}
	public void setShopMemberId(String shopMemberId) {
		this.shopMemberId = shopMemberId;
	}
	public String getShopMemberIdFinish() {
		return shopMemberIdFinish;
	}
	public void setShopMemberIdFinish(String shopMemberIdFinish) {
		this.shopMemberIdFinish = shopMemberIdFinish;
	}
	public String getShopIsName() {
		return shopIsName;
	}
	public void setShopIsName(String shopIsName) {
		this.shopIsName = shopIsName;
	}
	public String getShopExpenseDate() {
		return shopExpenseDate;
	}
	public void setShopExpenseDate(String shopExpenseDate) {
		this.shopExpenseDate = shopExpenseDate;
	}
	public String getShopExpenseInfo() {
		return shopExpenseInfo;
	}
	public void setShopExpenseInfo(String shopExpenseInfo) {
		this.shopExpenseInfo = shopExpenseInfo;
	}
	public String getShopExpensePrice() {
		return shopExpensePrice;
	}
	public void setShopExpensePrice(String shopExpensePrice) {
		this.shopExpensePrice = shopExpensePrice;
	}
	public String getShopExpenseRegDate() {
		return shopExpenseRegDate;
	}
	public void setShopExpenseRegDate(String shopExpenseRegDate) {
		this.shopExpenseRegDate = shopExpenseRegDate;
	}
	public String getShopExpenseFinish() {
		return shopExpenseFinish;
	}
	public void setShopExpenseFinish(String shopExpenseFinish) {
		this.shopExpenseFinish = shopExpenseFinish;
	}
	public String getShopExpenseFinishDate() {
		return shopExpenseFinishDate;
	}
	public void setShopExpenseFinishDate(String shopExpenseFinishDate) {
		this.shopExpenseFinishDate = shopExpenseFinishDate;
	}
	public String getShopExpenseSlipNumber() {
		return shopExpenseSlipNumber;
	}
	public void setShopExpenseSlipNumber(String shopExpenseSlipNumber) {
		this.shopExpenseSlipNumber = shopExpenseSlipNumber;
	}
	public String getShopExpenseGroupSlip() {
		return shopExpenseGroupSlip;
	}
	public void setShopExpenseGroupSlip(String shopExpenseGroupSlip) {
		this.shopExpenseGroupSlip = shopExpenseGroupSlip;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expense [shopExpenseCode=");
		builder.append(shopExpenseCode);
		builder.append(", shopIsCode=");
		builder.append(shopIsCode);
		builder.append(", shopClientCode=");
		builder.append(shopClientCode);
		builder.append(", shopMemberId=");
		builder.append(shopMemberId);
		builder.append(", shopMemberIdFinish=");
		builder.append(shopMemberIdFinish);
		builder.append(", shopIsName=");
		builder.append(shopIsName);
		builder.append(", shopExpenseDate=");
		builder.append(shopExpenseDate);
		builder.append(", shopExpenseInfo=");
		builder.append(shopExpenseInfo);
		builder.append(", shopExpensePrice=");
		builder.append(shopExpensePrice);
		builder.append(", shopExpenseRegDate=");
		builder.append(shopExpenseRegDate);
		builder.append(", shopExpenseFinish=");
		builder.append(shopExpenseFinish);
		builder.append(", shopExpenseFinishDate=");
		builder.append(shopExpenseFinishDate);
		builder.append(", shopExpenseSlipNumber=");
		builder.append(shopExpenseSlipNumber);
		builder.append(", shopExpenseGroupSlip=");
		builder.append(shopExpenseGroupSlip);
		builder.append(", mon=");
		builder.append(mon);
		builder.append(", chartPrice=");
		builder.append(chartPrice);
		builder.append("]");
		return builder.toString();
	}
	

}
