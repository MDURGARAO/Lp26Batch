package com.virtusa.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;


@Entity(name = "Book")
@Table(name = "book")


@DynamicUpdate
public class Book extends BaseBook {
 
   
    private String properties;
    
    
 
    public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProperties() {
        return properties;
    }

	public void setProperties(String properties) {
		this.properties = properties;
	}
 
    
 
    
}
