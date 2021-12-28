package ksmart41_teamtest.dto;

public class InvoiceReason {
	private String amendedInvoiceReasonCode;
	private String amendedInvoiceReasonName;
	public String getAmendedInvoiceReasonCode() {
		return amendedInvoiceReasonCode;
	}
	public void setAmendedInvoiceReasonCode(String amendedInvoiceReasonCode) {
		this.amendedInvoiceReasonCode = amendedInvoiceReasonCode;
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
		builder.append("InvoiceReason [amendedInvoiceReasonCode=");
		builder.append(amendedInvoiceReasonCode);
		builder.append(", amendedInvoiceReasonName=");
		builder.append(amendedInvoiceReasonName);
		builder.append("]");
		return builder.toString();
	}

	

	
	
}
