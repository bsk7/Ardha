package org.bsk.arda.entity;

import java.time.Month;
import java.time.Year;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rdpd_expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sno")
	private int sno;
	
	@Column(name="year")
	private int year;
	
	@Column(name="month")
	private String month;
	
	@Column(name="personal")
	private float personal;
	
	@Column(name="home")
	private float home;
	
	@Column(name="other")
	private float other;
	
	
		
	//no-arg default constuctor
	
	public Expense() {
		
	}



	public int getSno() {
		return sno;
	}



	public void setSno(int sno) {
		this.sno = sno;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String getMonth() {
		return month;
	}



	public void setMonth(String month) {
		this.month = month;
	}



	public float getPersonal() {
		return personal;
	}



	public void setPersonal(float personal) {
		this.personal = personal;
	}



	public float getHome() {
		return home;
	}



	public void setHome(float home) {
		this.home = home;
	}



	public float getOther() {
		return other;
	}



	public void setOther(float other) {
		this.other = other;
	}



	
	
}
