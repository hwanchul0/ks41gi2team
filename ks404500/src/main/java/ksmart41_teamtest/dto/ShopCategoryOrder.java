package ksmart41_teamtest.dto;

import java.util.Date;

public class ShopCategoryOrder {
	
	//상품카테고리
	private String categoryCode;
	private String memberId;
	private String largeCategory;
	private String middleCategory;
	private String smallCategory;
	private String goodsName;
	private Date regDate;
	private String categoryNote;
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getLargeCategory() {
		return largeCategory;
	}
	public void setLargeCategory(String largeCategory) {
		this.largeCategory = largeCategory;
	}
	public String getMiddleCategory() {
		return middleCategory;
	}
	public void setMiddleCategory(String middleCategory) {
		this.middleCategory = middleCategory;
	}
	public String getSmallCategory() {
		return smallCategory;
	}
	public void setSmallCategory(String smallCategory) {
		this.smallCategory = smallCategory;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getCategoryNote() {
		return categoryNote;
	}
	public void setCategoryNote(String categoryNote) {
		this.categoryNote = categoryNote;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopCategoryOrder [categoryCode=");
		builder.append(categoryCode);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", largeCategory=");
		builder.append(largeCategory);
		builder.append(", middleCategory=");
		builder.append(middleCategory);
		builder.append(", smallCategory=");
		builder.append(smallCategory);
		builder.append(", goodsName=");
		builder.append(goodsName);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", categoryNote=");
		builder.append(categoryNote);
		builder.append("]");
		return builder.toString();
	}
	

	
}