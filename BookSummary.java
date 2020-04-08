package com.virtusa.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "BookSummary")
@Table(name = "bookSummary")
public class BookSummary extends BaseBook {
	
	private String desc;

	public BookSummary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
 
	
}
