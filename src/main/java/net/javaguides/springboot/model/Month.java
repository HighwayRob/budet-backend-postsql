package net.javaguides.springboot.model;
  
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "month")
public class Month {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long monthid;
	
	@Column(name = "month")
	private Integer Month;

	public long getMonthid() {
		return monthid;
	}

	public void setMonthid(long monthid) {
		this.monthid = monthid;
	}

	public Integer getMonth() {
		return Month;
	}

	public void setMonth(Integer month) {
		Month = month;
	}

}
