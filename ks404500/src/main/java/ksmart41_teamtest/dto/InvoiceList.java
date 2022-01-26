package ksmart41_teamtest.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class InvoiceList {
	//유경 - 세금계산서 발행 항목
	private String invoiceCode;
	private String invoiceType;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date invoiceRegDate;
	private String mainBusinessCodeDemand;
	private String invoiceDemandBizNumber;
	private String invoiceDemandNumber;
	private String invoiceDemand;
	private String invoiceDemandName;
	private String invoiceDemandAddr;
	private String invoiceDemandType1;
	private String invoiceDemandType2;
	private String invoiceDemandEmail1;
	private String invoiceDemandEmail2;
	private int invoicePrice;
	private int invoiceTax;
	private String invoiceNote;
	private String invoiceState;
	private int cash;
	private int invoiceCheck;
	private int draft;
	private int accountsReceivable;
	private String confirm;
	private String amendCheck;
	private String amendedInvoiceCode;
	private int totalPrice;
	private int totalTax;
	private String contractManageCode;

	
	//유경 - 세금계산서 발행 상세 발행
	private String invoiceDetailCode;
	private String swIsCode;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date invoiceDetailDate;
	private String invoiceDetailProduct;
	private String invoiceDetailStandard;
	private int invoiceDetailQty;
	private int invoiceDetail;
	private int invoiceDetailUnitPrice;
	private int invoiceDetailTax;
	private String invoiceDetailNote;
	private String projectCode;
	
	//세금계산서 수정 사유
	private String amendedInvoiceReasonName;
	
	//세금계산서 기본발행코드
	private String addInvoiceCode;
	//세금계산서 세부발행될코드
	private String invoiceNewDetailCode;
	
	public String getInvoiceNewDetailCode() {
		return invoiceNewDetailCode;
	}
	public void setInvoiceNewDetailCode(String invoiceNewDetailCode) {
		this.invoiceNewDetailCode = invoiceNewDetailCode;
	}
	public String getAddInvoiceCode() {
		return addInvoiceCode;
	}
	public void setAddInvoiceCode(String addInvoiceCode) {
		this.addInvoiceCode = addInvoiceCode;
	}
	public String getContractManageCode() {
		return contractManageCode;
	}
	public void setContractManageCode(String contractManageCode) {
		this.contractManageCode = contractManageCode;
	}
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public Date getInvoiceRegDate() {
		return invoiceRegDate;
	}
	public void setInvoiceRegDate(Date invoiceRegDate) {
		this.invoiceRegDate = invoiceRegDate;
	}
	public String getMainBusinessCodeDemand() {
		return mainBusinessCodeDemand;
	}
	public void setMainBusinessCodeDemand(String mainBusinessCodeDemand) {
		this.mainBusinessCodeDemand = mainBusinessCodeDemand;
	}
	public String getInvoiceDemandBizNumber() {
		return invoiceDemandBizNumber;
	}
	public void setInvoiceDemandBizNumber(String invoiceDemandBizNumber) {
		this.invoiceDemandBizNumber = invoiceDemandBizNumber;
	}
	public String getInvoiceDemandNumber() {
		return invoiceDemandNumber;
	}
	public void setInvoiceDemandNumber(String invoiceDemandNumber) {
		this.invoiceDemandNumber = invoiceDemandNumber;
	}
	public String getInvoiceDemand() {
		return invoiceDemand;
	}
	public void setInvoiceDemand(String invoiceDemand) {
		this.invoiceDemand = invoiceDemand;
	}
	public String getInvoiceDemandName() {
		return invoiceDemandName;
	}
	public void setInvoiceDemandName(String invoiceDemandName) {
		this.invoiceDemandName = invoiceDemandName;
	}
	public String getInvoiceDemandAddr() {
		return invoiceDemandAddr;
	}
	public void setInvoiceDemandAddr(String invoiceDemandAddr) {
		this.invoiceDemandAddr = invoiceDemandAddr;
	}
	public String getInvoiceDemandType1() {
		return invoiceDemandType1;
	}
	public void setInvoiceDemandType1(String invoiceDemandType1) {
		this.invoiceDemandType1 = invoiceDemandType1;
	}
	public String getInvoiceDemandType2() {
		return invoiceDemandType2;
	}
	public void setInvoiceDemandType2(String invoiceDemandType2) {
		this.invoiceDemandType2 = invoiceDemandType2;
	}
	public String getInvoiceDemandEmail1() {
		return invoiceDemandEmail1;
	}
	public void setInvoiceDemandEmail1(String invoiceDemandEmail1) {
		this.invoiceDemandEmail1 = invoiceDemandEmail1;
	}
	public String getInvoiceDemandEmail2() {
		return invoiceDemandEmail2;
	}
	public void setInvoiceDemandEmail2(String invoiceDemandEmail2) {
		this.invoiceDemandEmail2 = invoiceDemandEmail2;
	}
	public int getInvoicePrice() {
		return invoicePrice;
	}
	public void setInvoicePrice(int invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
	public int getInvoiceTax() {
		return invoiceTax;
	}
	public void setInvoiceTax(int invoiceTax) {
		this.invoiceTax = invoiceTax;
	}
	public String getInvoiceNote() {
		return invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}
	public String getInvoiceState() {
		return invoiceState;
	}
	public void setInvoiceState(String invoiceState) {
		this.invoiceState = invoiceState;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getInvoiceCheck() {
		return invoiceCheck;
	}
	public void setInvoiceCheck(int invoiceCheck) {
		this.invoiceCheck = invoiceCheck;
	}
	public int getDraft() {
		return draft;
	}
	public void setDraft(int draft) {
		this.draft = draft;
	}
	public int getAccountsReceivable() {
		return accountsReceivable;
	}
	public void setAccountsReceivable(int accountsReceivable) {
		this.accountsReceivable = accountsReceivable;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getAmendCheck() {
		return amendCheck;
	}
	public void setAmendCheck(String amendCheck) {
		this.amendCheck = amendCheck;
	}
	public String getAmendedInvoiceCode() {
		return amendedInvoiceCode;
	}
	public void setAmendedInvoiceCode(String amendedInvoiceCode) {
		this.amendedInvoiceCode = amendedInvoiceCode;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(int totalTax) {
		this.totalTax = totalTax;
	}
	public String getInvoiceDetailCode() {
		return invoiceDetailCode;
	}
	public void setInvoiceDetailCode(String invoiceDetailCode) {
		this.invoiceDetailCode = invoiceDetailCode;
	}
	public String getSwIsCode() {
		return swIsCode;
	}
	public void setSwIsCode(String swIsCode) {
		this.swIsCode = swIsCode;
	}
	public Date getInvoiceDetailDate() {
		return invoiceDetailDate;
	}
	public void setInvoiceDetailDate(Date invoiceDetailDate) {
		this.invoiceDetailDate = invoiceDetailDate;
	}
	public String getInvoiceDetailProduct() {
		return invoiceDetailProduct;
	}
	public void setInvoiceDetailProduct(String invoiceDetailProduct) {
		this.invoiceDetailProduct = invoiceDetailProduct;
	}
	public String getInvoiceDetailStandard() {
		return invoiceDetailStandard;
	}
	public void setInvoiceDetailStandard(String invoiceDetailStandard) {
		this.invoiceDetailStandard = invoiceDetailStandard;
	}
	public int getInvoiceDetailQty() {
		return invoiceDetailQty;
	}
	public void setInvoiceDetailQty(int invoiceDetailQty) {
		this.invoiceDetailQty = invoiceDetailQty;
	}
	public int getInvoiceDetail() {
		return invoiceDetail;
	}
	public void setInvoiceDetail(int invoiceDetail) {
		this.invoiceDetail = invoiceDetail;
	}
	public int getInvoiceDetailUnitPrice() {
		return invoiceDetailUnitPrice;
	}
	public void setInvoiceDetailUnitPrice(int invoiceDetailUnitPrice) {
		this.invoiceDetailUnitPrice = invoiceDetailUnitPrice;
	}
	public int getInvoiceDetailTax() {
		return invoiceDetailTax;
	}
	public void setInvoiceDetailTax(int invoiceDetailTax) {
		this.invoiceDetailTax = invoiceDetailTax;
	}
	public String getInvoiceDetailNote() {
		return invoiceDetailNote;
	}
	public void setInvoiceDetailNote(String invoiceDetailNote) {
		this.invoiceDetailNote = invoiceDetailNote;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
	public String getAmendedInvoiceReasonName() {
		return amendedInvoiceReasonName;
	}
	public void setAmendedInvoiceReasonName(String amendedInvoiceReasonName) {
		this.amendedInvoiceReasonName = amendedInvoiceReasonName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InvoiceList [invoiceCode=");
		builder.append(invoiceCode);
		builder.append(", invoiceType=");
		builder.append(invoiceType);
		builder.append(", invoiceRegDate=");
		builder.append(invoiceRegDate);
		builder.append(", mainBusinessCodeDemand=");
		builder.append(mainBusinessCodeDemand);
		builder.append(", invoiceDemandBizNumber=");
		builder.append(invoiceDemandBizNumber);
		builder.append(", invoiceDemandNumber=");
		builder.append(invoiceDemandNumber);
		builder.append(", invoiceDemand=");
		builder.append(invoiceDemand);
		builder.append(", invoiceDemandName=");
		builder.append(invoiceDemandName);
		builder.append(", invoiceDemandAddr=");
		builder.append(invoiceDemandAddr);
		builder.append(", invoiceDemandType1=");
		builder.append(invoiceDemandType1);
		builder.append(", invoiceDemandType2=");
		builder.append(invoiceDemandType2);
		builder.append(", invoiceDemandEmail1=");
		builder.append(invoiceDemandEmail1);
		builder.append(", invoiceDemandEmail2=");
		builder.append(invoiceDemandEmail2);
		builder.append(", invoicePrice=");
		builder.append(invoicePrice);
		builder.append(", invoiceTax=");
		builder.append(invoiceTax);
		builder.append(", invoiceNote=");
		builder.append(invoiceNote);
		builder.append(", invoiceState=");
		builder.append(invoiceState);
		builder.append(", cash=");
		builder.append(cash);
		builder.append(", invoiceCheck=");
		builder.append(invoiceCheck);
		builder.append(", draft=");
		builder.append(draft);
		builder.append(", accountsReceivable=");
		builder.append(accountsReceivable);
		builder.append(", confirm=");
		builder.append(confirm);
		builder.append(", amendCheck=");
		builder.append(amendCheck);
		builder.append(", amendedInvoiceCode=");
		builder.append(amendedInvoiceCode);
		builder.append(", totalPrice=");
		builder.append(totalPrice);
		builder.append(", totalTax=");
		builder.append(totalTax);
		builder.append(", contractManageCode=");
		builder.append(contractManageCode);
		builder.append(", invoiceDetailCode=");
		builder.append(invoiceDetailCode);
		builder.append(", swIsCode=");
		builder.append(swIsCode);
		builder.append(", invoiceDetailDate=");
		builder.append(invoiceDetailDate);
		builder.append(", invoiceDetailProduct=");
		builder.append(invoiceDetailProduct);
		builder.append(", invoiceDetailStandard=");
		builder.append(invoiceDetailStandard);
		builder.append(", invoiceDetailQty=");
		builder.append(invoiceDetailQty);
		builder.append(", invoiceDetail=");
		builder.append(invoiceDetail);
		builder.append(", invoiceDetailUnitPrice=");
		builder.append(invoiceDetailUnitPrice);
		builder.append(", invoiceDetailTax=");
		builder.append(invoiceDetailTax);
		builder.append(", invoiceDetailNote=");
		builder.append(invoiceDetailNote);
		builder.append(", projectCode=");
		builder.append(projectCode);
		builder.append(", amendedInvoiceReasonName=");
		builder.append(amendedInvoiceReasonName);
		builder.append(", addInvoiceCode=");
		builder.append(addInvoiceCode);
		builder.append(", invoiceNewDetailCode=");
		builder.append(invoiceNewDetailCode);
		builder.append("]");
		return builder.toString();
	}
	
	

	
}
