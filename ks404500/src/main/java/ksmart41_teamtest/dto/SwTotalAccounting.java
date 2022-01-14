package ksmart41_teamtest.dto;

public class SwTotalAccounting {
	//유경 - 개발사 통합회계 
	private String swTotalTable;
	private int swTotalPrice;
	private String swTotalGroupSlip;
	private String swGroupSlip;
	private String swTotalCode;
	private String swSalesSection; //매출 비용 구분 컬럼
	
	//매출
	private String swIncomeCode;
	private String contractManageCode;
	private int servicePaymentAmount;

	//비용
	private String swExpensePayCode;
	private int swExpensePrice;
	
	
	//조회
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
	public String getSwExpensePayCode() {
		return swExpensePayCode;
	}
	public void setSwExpensePayCode(String swExpensePayCode) {
		this.swExpensePayCode = swExpensePayCode;
	}
	public int getSwExpensePrice() {
		return swExpensePrice;
	}
	public void setSwExpensePrice(int swExpensePrice) {
		this.swExpensePrice = swExpensePrice;
	}
	public String getSwTotalGroupSlip() {
		return swTotalGroupSlip;
	}
	public void setSwTotalGroupSlip(String swTotalGroupSlip) {
		this.swTotalGroupSlip = swTotalGroupSlip;
	}
	public String getSwIncomeCode() {
		return swIncomeCode;
	}
	public void setSwIncomeCode(String swIncomeCode) {
		this.swIncomeCode = swIncomeCode;
	}
	public String getContractManageCode() {
		return contractManageCode;
	}
	public void setContractManageCode(String contractManageCode) {
		this.contractManageCode = contractManageCode;
	}
	public String getSwGroupSlip() {
		return swGroupSlip;
	}
	public void setSwGroupSlip(String swGroupSlip) {
		this.swGroupSlip = swGroupSlip;
	}
	public int getServicePaymentAmount() {
		return servicePaymentAmount;
	}
	public void setServicePaymentAmount(int servicePaymentAmount) {
		this.servicePaymentAmount = servicePaymentAmount;
	}
	public String getSwTotalCode() {
		return swTotalCode;
	}
	public void setSwTotalCode(String swTotalCode) {
		this.swTotalCode = swTotalCode;
	}
	public String getSwSalesSection() {
		return swSalesSection;
	}
	public void setSwSalesSection(String swSalesSection) {
		this.swSalesSection = swSalesSection;
	}
	public String getSwTotalTable() {
		return swTotalTable;
	}
	public void setSwTotalTable(String swTotalTable) {
		this.swTotalTable = swTotalTable;
	}
	public int getSwTotalPrice() {
		return swTotalPrice;
	}
	public void setSwTotalPrice(int swTotalPrice) {
		this.swTotalPrice = swTotalPrice;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SwTotalAccounting [swTotalTable=");
		builder.append(swTotalTable);
		builder.append(", swTotalPrice=");
		builder.append(swTotalPrice);
		builder.append(", swTotalGroupSlip=");
		builder.append(swTotalGroupSlip);
		builder.append(", swGroupSlip=");
		builder.append(swGroupSlip);
		builder.append(", swTotalCode=");
		builder.append(swTotalCode);
		builder.append(", swSalesSection=");
		builder.append(swSalesSection);
		builder.append(", swIncomeCode=");
		builder.append(swIncomeCode);
		builder.append(", contractManageCode=");
		builder.append(contractManageCode);
		builder.append(", servicePaymentAmount=");
		builder.append(servicePaymentAmount);
		builder.append(", swExpensePayCode=");
		builder.append(swExpensePayCode);
		builder.append(", swExpensePrice=");
		builder.append(swExpensePrice);
		builder.append(", sales2021=");
		builder.append(sales2021);
		builder.append(", expense2021=");
		builder.append(expense2021);
		builder.append("]");
		return builder.toString();
	}
	
}
