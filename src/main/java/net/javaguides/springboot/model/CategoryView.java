package net.javaguides.springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
 
@Entity
@Immutable
@Table(name = "`categoryview`")
public class CategoryView {

		@Id
		private int categoryid;
		private String categoryname;
		private Long budget; 
		private Float w1; 
		private Float w2; 
		private Float w3; 
		private Float w4; 
		private Float w5; 
		private Float wtotal; 
		private Float expnet; 
		private String status; 
		
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

		@Column(name = "w1")
		public Float getW1() {
			return w1;
		}

		@Column(name = "w2")
		public Float getW2() {
			return w2;
		}
		@Column(name = "w3")
		public Float getW3() {
			return w3;
		}
		@Column(name = "w4")
		public Float getW4() {
			return w4;
		}
		@Column(name = "w5")
		public Float getW5() {
			return w5;
		}
		@Column(name = "wtotal")
		public Float getWtotal() {
			return wtotal;
		}
		@Column(name = "expnet")
		public Float getExpnet() {
			return expnet;
		}
		@Column(name = "status")
		public String getStatus() {
			return status;
		}

}
