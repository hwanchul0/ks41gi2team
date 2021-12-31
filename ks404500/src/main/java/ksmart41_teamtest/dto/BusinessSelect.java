package ksmart41_teamtest.dto;

public class BusinessSelect {
	private String mainBusinessCode;
	private String businessCode;
	private String businessLevelCode;
	private String businessRegistrationCode; 
	private String businessCodeRegistrationDate;
	private String businessCodeDeleteDate;
	private String clientId;
	private String localCode;
	private String memberId;
	private String businessName;
	private String businessRepresentativeName;
	private String bunsinessNumber;
	private String businessPhone;
	private String businessAddr;
	private String businessEmail;
	private String businessManagerName;
	private String businessManagerPhone;
	private String businessManagerEmail;
	private String businessMainAccount;
	private String businessAccountNumber;
	private String businessAccountHolder;
	private String businessType1;
	private String businessType2;
	private String businessRegistration;
	private String businessRegistrationState;
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBusinessLevelCode() {
		return businessLevelCode;
	}
	public void setBusinessLevelCode(String businessLevelCode) {
		this.businessLevelCode = businessLevelCode;
	}
	public String getBusinessRegistrationCode() {
		return businessRegistrationCode;
	}
	public void setBusinessRegistrationCode(String businessRegistrationCode) {
		this.businessRegistrationCode = businessRegistrationCode;
	}
	public String getBusinessCodeRegistrationDate() {
		return businessCodeRegistrationDate;
	}
	public void setBusinessCodeRegistrationDate(String businessCodeRegistrationDate) {
		this.businessCodeRegistrationDate = businessCodeRegistrationDate;
	}
	public String getBusinessCodeDeleteDate() {
		return businessCodeDeleteDate;
	}
	public void setBusinessCodeDeleteDate(String businessCodeDeleteDate) {
		this.businessCodeDeleteDate = businessCodeDeleteDate;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getLocalCode() {
		return localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessRepresentativeName() {
		return businessRepresentativeName;
	}
	public void setBusinessRepresentativeName(String businessRepresentativeName) {
		this.businessRepresentativeName = businessRepresentativeName;
	}
	public String getBunsinessNumber() {
		return bunsinessNumber;
	}
	public void setBunsinessNumber(String bunsinessNumber) {
		this.bunsinessNumber = bunsinessNumber;
	}
	public String getBusinessPhone() {
		return businessPhone;
	}
	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}
	public String getBusinessAddr() {
		return businessAddr;
	}
	public void setBusinessAddr(String businessAddr) {
		this.businessAddr = businessAddr;
	}
	public String getBusinessEmail() {
		return businessEmail;
	}
	public void setBusinessEmail(String businessEmail) {
		this.businessEmail = businessEmail;
	}
	public String getBusinessManagerName() {
		return businessManagerName;
	}
	public void setBusinessManagerName(String businessManagerName) {
		this.businessManagerName = businessManagerName;
	}
	public String getBusinessManagerPhone() {
		return businessManagerPhone;
	}
	public void setBusinessManagerPhone(String businessManagerPhone) {
		this.businessManagerPhone = businessManagerPhone;
	}
	public String getBusinessManagerEmail() {
		return businessManagerEmail;
	}
	public void setBusinessManagerEmail(String businessManagerEmail) {
		this.businessManagerEmail = businessManagerEmail;
	}
	public String getBusinessMainAccount() {
		return businessMainAccount;
	}
	public void setBusinessMainAccount(String businessMainAccount) {
		this.businessMainAccount = businessMainAccount;
	}
	public String getBusinessAccountNumber() {
		return businessAccountNumber;
	}
	public void setBusinessAccountNumber(String businessAccountNumber) {
		this.businessAccountNumber = businessAccountNumber;
	}
	public String getBusinessAccountHolder() {
		return businessAccountHolder;
	}
	public void setBusinessAccountHolder(String businessAccountHolder) {
		this.businessAccountHolder = businessAccountHolder;
	}
	public String getBusinessType1() {
		return businessType1;
	}
	public void setBusinessType1(String businessType1) {
		this.businessType1 = businessType1;
	}
	public String getBusinessType2() {
		return businessType2;
	}
	public void setBusinessType2(String businessType2) {
		this.businessType2 = businessType2;
	}
	public String getBusinessRegistration() {
		return businessRegistration;
	}
	public void setBusinessRegistration(String businessRegistration) {
		this.businessRegistration = businessRegistration;
	}
	public String getBusinessRegistrationState() {
		return businessRegistrationState;
	}
	public void setBusinessRegistrationState(String businessRegistrationState) {
		this.businessRegistrationState = businessRegistrationState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BusinessSelect [mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", businessCode=");
		builder.append(businessCode);
		builder.append(", businessLevelCode=");
		builder.append(businessLevelCode);
		builder.append(", businessRegistrationCode=");
		builder.append(businessRegistrationCode);
		builder.append(", businessCodeRegistrationDate=");
		builder.append(businessCodeRegistrationDate);
		builder.append(", businessCodeDeleteDate=");
		builder.append(businessCodeDeleteDate);
		builder.append(", clientId=");
		builder.append(clientId);
		builder.append(", localCode=");
		builder.append(localCode);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", businessName=");
		builder.append(businessName);
		builder.append(", businessRepresentativeName=");
		builder.append(businessRepresentativeName);
		builder.append(", bunsinessNumber=");
		builder.append(bunsinessNumber);
		builder.append(", businessPhone=");
		builder.append(businessPhone);
		builder.append(", businessAddr=");
		builder.append(businessAddr);
		builder.append(", businessEmail=");
		builder.append(businessEmail);
		builder.append(", businessManagerName=");
		builder.append(businessManagerName);
		builder.append(", businessManagerPhone=");
		builder.append(businessManagerPhone);
		builder.append(", businessManagerEmail=");
		builder.append(businessManagerEmail);
		builder.append(", businessMainAccount=");
		builder.append(businessMainAccount);
		builder.append(", businessAccountNumber=");
		builder.append(businessAccountNumber);
		builder.append(", businessAccountHolder=");
		builder.append(businessAccountHolder);
		builder.append(", businessType1=");
		builder.append(businessType1);
		builder.append(", businessType2=");
		builder.append(businessType2);
		builder.append(", businessRegistration=");
		builder.append(businessRegistration);
		builder.append(", businessRegistrationState=");
		builder.append(businessRegistrationState);
		builder.append("]");
		return builder.toString();
	}

}
