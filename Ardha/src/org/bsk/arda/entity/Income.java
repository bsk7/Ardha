package org.bsk.arda.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rdpd_income")
public class Income {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sno")
	private int sno;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="source")
	private String source;
	
	@Column(name="amount")
	private float amount;
	
	@Column(name="description")
	private String description;
		
	//no-arg default constuctor
	
	public Income() {
		
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Income [sno=" + sno + ", source=" + source + ", amount=" + amount + ", description=" + description
				+ "]";
	}
	
	
	
	
}
