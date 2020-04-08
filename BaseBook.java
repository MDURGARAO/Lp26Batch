package com.virtusa.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@MappedSuperclass
public class BaseBook{
 
    @Id
    @GeneratedValue
    private Long id;
 
    @NaturalId
    @Column(length = 15)
    private String isbn;
 
    @Column(length = 50)
    private String title;
 
    @Column(length = 50)
    private String author;
    
    
   

	public BaseBook() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}  

}


