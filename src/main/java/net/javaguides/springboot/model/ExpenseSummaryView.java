package net.javaguides.springboot.model;
   
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "`expensesummary`")
public class ExpenseSummaryView {

	@Id
	private int categoryid;
	private String categoryname;
	private Long budget; 
	private int month;
	private int week;
	private Float totalcategoryexpense; 
	
	@Column(name = "categoryid")
	public int getCategoryid() {
		return categoryid;
	}
	
	@Column(name = "categoryname")
	public String getCategoryname() {
		return categoryname;
	}
	
	@Column(name = "budget")
	public Long getBudget() {
		return budget;
	}
	
	@Column(name = "month")
	public int getMonth() {
		return month;
	}

	@Column(name = "week")
	public int getWeek() {
		return week;
	}
	
	@Column(name = "totalcategoryexpense")
	public Float getTotalcategoryexpense() {
		return totalcategoryexpense;
	}
	
	
}
