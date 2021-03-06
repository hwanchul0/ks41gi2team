package ksmart41_teamtest.dto;

import java.util.Date;

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
	private String addIncomeCode; //생성될 income 코드
	private String shopMemberId;
	
	//차트생성
	private String mon; //월
	private String chartPrice; //월합계
	
	//마감확인
	private String shopIncomeFinish; //마감확인
	private Date shopIncomeFinishDate; //마감날짜
	private String shopIsCode;
	private int finalIncomeVatImply;
	private int finalIncomeVatNotImply;
	private Date shopIncomeDate;
	private Date shopIncomeRegDate;

	
	//쇼핑몰 통합회계 - 매출
	private String shopIncomeGroupSlip;
	private String shopTotalCode;
	private int shopTotalPrice;
	private String shopSalesSection;
	private String shopTotalTable;
	private String shopGroupSlip;
	
	//쇼핑몰 통합회계 - 매입
	private String shopExpenseCode;
	private String shopExpenseGroupSlip;
	private int shopExpensePrice;
	
	//쇼핑몰 통합회계 - 조회
	private int sales2021;
	private int expense2021;
	
	
	
	public int getSales2021() {
		return sales2021;
	}
	public void setSales2021(int sales2021) {
		this.sales2021 = sales2021;
	}
	public int getExpense2021() {
		return expense2021;
	}
	public void setExpense2021(int expense2021) {
		this.expense2021 = expense2021;
	}
	public String getShopExpenseCode() {
		return shopExpenseCode;
	}
	public void setShopExpenseCode(String shopExpenseCode) {
		this.shopExpenseCode = shopExpenseCode;
	}
	public String getShopExpenseGroupSlip() {
		return shopExpenseGroupSlip;
	}
	public void setShopExpenseGroupSlip(String shopExpenseGroupSlip) {
		this.shopExpenseGroupSlip = shopExpenseGroupSlip;
	}
	public String getShopGroupSlip() {
		return shopGroupSlip;
	}
	public void setShopGroupSlip(String shopGroupSlip) {
		this.shopGroupSlip = shopGroupSlip;
	}
	public int getShopExpensePrice() {
		return shopExpensePrice;
	}
	public void setShopExpensePrice(int shopExpensePrice) {
		this.shopExpensePrice = shopExpensePrice;
	}
	public String getShopIncomeGroupSlip() {
		return shopIncomeGroupSlip;
	}
	public void setShopIncomeGroupSlip(String shopIncomeGroupSlip) {
		this.shopIncomeGroupSlip = shopIncomeGroupSlip;
	}
	public String getShopTotalCode() {
		return shopTotalCode;
	}
	public void setShopTotalCode(String shopTotalCode) {
		this.shopTotalCode = shopTotalCode;
	}
	public int getShopTotalPrice() {
		return shopTotalPrice;
	}
	public void setShopTotalPrice(int shopTotalPrice) {
		this.shopTotalPrice = shopTotalPrice;
	}
	public String getShopSalesSection() {
		return shopSalesSection;
	}
	public void setShopSalesSection(String shopSalesSection) {
		this.shopSalesSection = shopSalesSection;
	}
	public String getShopTotalTable() {
		return shopTotalTable;
	}
	public void setShopTotalTable(String shopTotalTable) {
		this.shopTotalTable = shopTotalTable;
	}
	public int getShopExpenseMonPrice() {
		return shopExpensePrice;
	}
	public void setShopExpenseMonPrice(int shopExpenseMonPrice) {
		this.shopExpensePrice = shopExpenseMonPrice;
	}
	public String getShopIsCode() {
		return shopIsCode;
	}
	public void setShopIsCode(String shopIsCode) {
		this.shopIsCode = shopIsCode;
	}
	public int getFinalIncomeVatImply() {
		return finalIncomeVatImply;
	}
	public void setFinalIncomeVatImply(int finalIncomeVatImply) {
		this.finalIncomeVatImply = finalIncomeVatImply;
	}
	public int getFinalIncomeVatNotImply() {
		return finalIncomeVatNotImply;
	}
	public void setFinalIncomeVatNotImply(int finalIncomeVatNotImply) {
		this.finalIncomeVatNotImply = finalIncomeVatNotImply;
	}
	public Date getShopIncomeDate() {
		return shopIncomeDate;
	}
	public void setShopIncomeDate(Date shopIncomeDate) {
		this.shopIncomeDate = shopIncomeDate;
	}
	public Date getShopIncomeRegDate() {
		return shopIncomeRegDate;
	}
	public void setShopIncomeRegDate(Date shopIncomeRegDate) {
		this.shopIncomeRegDate = shopIncomeRegDate;
	}
	public String getShopIncomeFinish() {
		return shopIncomeFinish;
	}
	public void setShopIncomeFinish(String shopIncomeFinish) {
		this.shopIncomeFinish = shopIncomeFinish;
	}
	public Date getShopIncomeFinishDate() {
		return shopIncomeFinishDate;
	}
	public void setShopIncomeFinishDate(Date shopIncomeFinishDate) {
		this.shopIncomeFinishDate = shopIncomeFinishDate;
	}
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
	public String getShopMemberId() {
		return shopMemberId;
	}
	public void setShopMemberId(String shopMemberId) {
		this.shopMemberId = shopMemberId;
	}
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
		builder.append(", shopMemberId=");
		builder.append(shopMemberId);
		builder.append(", mon=");
		builder.append(mon);
		builder.append(", chartPrice=");
		builder.append(chartPrice);
		builder.append(", shopIncomeFinish=");
		builder.append(shopIncomeFinish);
		builder.append(", shopIncomeFinishDate=");
		builder.append(shopIncomeFinishDate);
		builder.append(", shopIsCode=");
		builder.append(shopIsCode);
		builder.append(", finalIncomeVatImply=");
		builder.append(finalIncomeVatImply);
		builder.append(", finalIncomeVatNotImply=");
		builder.append(finalIncomeVatNotImply);
		builder.append(", shopIncomeDate=");
		builder.append(shopIncomeDate);
		builder.append(", shopIncomeRegDate=");
		builder.append(shopIncomeRegDate);
		builder.append(", shopIncomeGroupSlip=");
		builder.append(shopIncomeGroupSlip);
		builder.append(", shopTotalCode=");
		builder.append(shopTotalCode);
		builder.append(", shopTotalPrice=");
		builder.append(shopTotalPrice);
		builder.append(", shopSalesSection=");
		builder.append(shopSalesSection);
		builder.append(", shopTotalTable=");
		builder.append(shopTotalTable);
		builder.append(", shopGroupSlip=");
		builder.append(shopGroupSlip);
		builder.append(", shopExpenseCode=");
		builder.append(shopExpenseCode);
		builder.append(", shopExpenseGroupSlip=");
		builder.append(shopExpenseGroupSlip);
		builder.append(", shopExpensePrice=");
		builder.append(shopExpensePrice);
		builder.append(", sales2021=");
		builder.append(sales2021);
		builder.append(", expense2021=");
		builder.append(expense2021);
		builder.append("]");
		return builder.toString();
	}
	

	
}
