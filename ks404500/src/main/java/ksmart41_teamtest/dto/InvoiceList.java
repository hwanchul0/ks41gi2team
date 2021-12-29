package ksmart41_teamtest.dto;


public class InvoiceList {
	private String invoiceCode;
	private String invoiceType;
	private String invoiceRegDate;
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
	public String getInvoiceRegDate() {
		return invoiceRegDate;
	}
	public void setInvoiceRegDate(String invoiceRegDate) {
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
		builder.append("]");
		return builder.toString();
	}
	
}
