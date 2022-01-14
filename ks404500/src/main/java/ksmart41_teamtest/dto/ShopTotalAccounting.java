package ksmart41_teamtest.dto;

public class ShopTotalAccounting {
	//2021 분기 비용
	private int expense1Q;
	private int expense2Q;
	private int expense3Q;
	private int expense4Q;
	
	//2021 분기 매출
	private int sales1Q;
	private int sales2Q;
	private int sales3Q;
	private int sales4Q;
	
	public int getExpense1Q() {
		return expense1Q;
	}
	public void setExpense1Q(int expense1q) {
		expense1Q = expense1q;
	}
	public int getExpense2Q() {
		return expense2Q;
	}
	public void setExpense2Q(int expense2q) {
		expense2Q = expense2q;
	}
	public int getExpense3Q() {
		return expense3Q;
	}
	public void setExpense3Q(int expense3q) {
		expense3Q = expense3q;
	}
	public int getExpense4Q() {
		return expense4Q;
	}
	public void setExpense4Q(int expense4q) {
		expense4Q = expense4q;
	}
	public int getSales1Q() {
		return sales1Q;
	}
	public void setSales1Q(int sales1q) {
		sales1Q = sales1q;
	}
	public int getSales2Q() {
		return sales2Q;
	}
	public void setSales2Q(int sales2q) {
		sales2Q = sales2q;
	}
	public int getSales3Q() {
		return sales3Q;
	}
	public void setSales3Q(int sales3q) {
		sales3Q = sales3q;
	}
	public int getSales4Q() {
		return sales4Q;
	}
	public void setSales4Q(int sales4q) {
		sales4Q = sales4q;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopTotalAccounting [expense1Q=");
		builder.append(expense1Q);
		builder.append(", expense2Q=");
		builder.append(expense2Q);
		builder.append(", expense3Q=");
		builder.append(expense3Q);
		builder.append(", expense4Q=");
		builder.append(expense4Q);
		builder.append(", sales1Q=");
		builder.append(sales1Q);
		builder.append(", sales2Q=");
		builder.append(sales2Q);
		builder.append(", sales3Q=");
		builder.append(sales3Q);
		builder.append(", sales4Q=");
		builder.append(sales4Q);
		builder.append("]");
		return builder.toString();
	}
	
	
}
