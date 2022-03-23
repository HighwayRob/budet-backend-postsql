package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
   
@Entity
@Table(name = "expense")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long expenseid;
	
	@Column(name = "month")
	private Integer Month;

	@Column(name = "week")
	private Integer Week;

	@Column(name = "vendor")
	private String Vendor;
	
	@Column(name = "amount")
	private Float Amount;

	@Column(name = "categoryid")
	private Integer categoryId;

	public long getExpenseid() {
		return expenseid;
	}

	public void setExpenseid(long expenseid) {
		this.expenseid = expenseid;
	}

	public Integer getMonth() {
		return Month;
	}

	public void setMonth(Integer month) {
		Month = month;
	}

	public Integer getWeek() {
		return Week;
	}

	public void setWeek(Integer week) {
		Week = week;
	}

	public String getVendor() {
		return Vendor;
	}

	public void setVendor(String vendor) {
		Vendor = vendor;
	}

	public Float getAmount() {
		return Amount;
	}

	public void setAmount(Float amount) {
		Amount = amount;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

}
