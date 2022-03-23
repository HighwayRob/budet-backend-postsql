package net.javaguides.springboot.model;
  
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryid;
	
	@Column(name = "categoryname")
	private String categoryName;

	@Column(name = "budget")
	private Long Budget;
	
	@Column(name = "w1")
	private Float W1;
	
	@Column(name = "w2")
	private Float W2;
	
	@Column(name = "w3")
	private Float W3;
	
	@Column(name = "w4")
	private Float W4;
	
	@Column(name = "w5")
	private Float W5;

	@Column(name = "wtotal")
	private Float Wtotal;

	@Column(name = "expnet")
	private Float Expnet;

	@Column(name = "status")
	private String Status;

	public long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getBudget() {
		return Budget;
	}

	public void setBudget(Long budget) {
		Budget = budget;
	}

	public Float getW1() {
		return W1;
	}

	public void setW1(Float w1) {
		W1 = w1;
	}

	public Float getW2() {
		return W2;
	}

	public void setW2(Float w2) {
		W2 = w2;
	}

	public Float getW3() {
		return W3;
	}

	public void setW3(Float w3) {
		W3 = w3;
	}

	public Float getW4() {
		return W4;
	}

	public void setW4(Float w4) {
		W4 = w4;
	}

	public Float getW5() {
		return W5;
	}

	public void setW5(Float w5) {
		W5 = w5;
	}

	public Float getWtotal() {
		return Wtotal;
	}

	public void setWtotal(Float wtotal) {
		Wtotal = wtotal;
	}

	public Float getExpnet() {
		return Expnet;
	}

	public void setExpnet(Float expnet) {
		Expnet = expnet;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
}
