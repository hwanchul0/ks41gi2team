package ksmart41_teamtest.dto;

public class LocalCode {
	private String localCode;
	private String localNumber;
	private String localName;
	public String getLocalCode() {
		return localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	public String getLocalNumber() {
		return localNumber;
	}
	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LocalLode [localCode=");
		builder.append(localCode);
		builder.append(", localNumber=");
		builder.append(localNumber);
		builder.append(", localName=");
		builder.append(localName);
		builder.append("]");
		return builder.toString();
	}
	
}
