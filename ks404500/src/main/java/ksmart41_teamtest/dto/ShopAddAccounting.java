package ksmart41_teamtest.dto;

//유경 - 쇼핑몰 매출등록
public class ShopAddAccounting {
	private String addIncome;
	private String shopIncomeCode;
	private String releaseCode;
	private String shopOrderCode;
	private String shopSlipNumber; //전표번호
	private int shopOrderAmount;
	private int goodsPaymentAmount;
	private int nontax;
	private int checkRefund;
	private int renontax; //세금포함 금액
	private int retax; //세금
	private String shopPaymentDate;
	private String shopRefundCode;
	private String shopRefundDate;
	private String groupslip; //통합그룹코드
	private String shopPaymentCheckCode;
	private String addIncomeCode;
	
	public String getAddIncome() {
		return addIncome;
	}
	public void setAddIncome(String addIncome) {
		this.addIncome = addIncome;
	}
	public String getShopIncomeCode() {
		return shopIncomeCode;
	}
	public void setShopIncomeCode(String shopIncomeCode) {
		this.shopIncomeCode = shopIncomeCode;
	}
	public String getReleaseCode() {
		return releaseCode;
	}
	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}
	public String getShopOrderCode() {
		return shopOrderCode;
	}
	public void setShopOrderCode(String shopOrderCode) {
		this.shopOrderCode = shopOrderCode;
	}
	public String getShopSlipNumber() {
		return shopSlipNumber;
	}
	public void setShopSlipNumber(String shopSlipNumber) {
		this.shopSlipNumber = shopSlipNumber;
	}
	public int getShopOrderAmount() {
		return shopOrderAmount;
	}
	public void setShopOrderAmount(int shopOrderAmount) {
		this.shopOrderAmount = shopOrderAmount;
	}
	public int getGoodsPaymentAmount() {
		return goodsPaymentAmount;
	}
	public void setGoodsPaymentAmount(int goodsPaymentAmount) {
		this.goodsPaymentAmount = goodsPaymentAmount;
	}
	public int getNontax() {
		return nontax;
	}
	public void setNontax(int nontax) {
		this.nontax = nontax;
	}
	public int getCheckRefund() {
		return checkRefund;
	}
	public void setCheckRefund(int checkRefund) {
		this.checkRefund = checkRefund;
	}
	public int getRenontax() {
		return renontax;
	}
	public void setRenontax(int renontax) {
		this.renontax = renontax;
	}
	public int getRetax() {
		return retax;
	}
	public void setRetax(int retax) {
		this.retax = retax;
	}
	public String getShopPaymentDate() {
		return shopPaymentDate;
	}
	public void setShopPaymentDate(String shopPaymentDate) {
		this.shopPaymentDate = shopPaymentDate;
	}
	public String getShopRefundCode() {
		return shopRefundCode;
	}
	public void setShopRefundCode(String shopRefundCode) {
		this.shopRefundCode = shopRefundCode;
	}
	public String getShopRefundDate() {
		return shopRefundDate;
	}
	public void setShopRefundDate(String shopRefundDate) {
		this.shopRefundDate = shopRefundDate;
	}
	public String getGroupslip() {
		return groupslip;
	}
	public void setGroupslip(String groupslip) {
		this.groupslip = groupslip;
	}
	public String getShopPaymentCheckCode() {
		return shopPaymentCheckCode;
	}
	public void setShopPaymentCheckCode(String shopPaymentCheckCode) {
		this.shopPaymentCheckCode = shopPaymentCheckCode;
	}
	
	public String getAddIncomeCode() {
		return addIncomeCode;
	}
	public void setAddIncomeCode(String addIncomeCode) {
		this.addIncomeCode = addIncomeCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopAddAccounting [addIncome=");
		builder.append(addIncome);
		builder.append(", shopIncomeCode=");
		builder.append(shopIncomeCode);
		builder.append(", releaseCode=");
		builder.append(releaseCode);
		builder.append(", shopOrderCode=");
		builder.append(shopOrderCode);
		builder.append(", shopSlipNumber=");
		builder.append(shopSlipNumber);
		builder.append(", shopOrderAmount=");
		builder.append(shopOrderAmount);
		builder.append(", goodsPaymentAmount=");
		builder.append(goodsPaymentAmount);
		builder.append(", nontax=");
		builder.append(nontax);
		builder.append(", checkRefund=");
		builder.append(checkRefund);
		builder.append(", renontax=");
		builder.append(renontax);
		builder.append(", retax=");
		builder.append(retax);
		builder.append(", shopPaymentDate=");
		builder.append(shopPaymentDate);
		builder.append(", shopRefundCode=");
		builder.append(shopRefundCode);
		builder.append(", shopRefundDate=");
		builder.append(shopRefundDate);
		builder.append(", groupslip=");
		builder.append(groupslip);
		builder.append(", shopPaymentCheckCode=");
		builder.append(shopPaymentCheckCode);
		builder.append(", addIncomeCode=");
		builder.append(addIncomeCode);
		builder.append("]");
		return builder.toString();
	}
	
	
}
