package com.virtusa.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DeveloperCompositeKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	   @Id
	    @GeneratedValue
	    private int devId;
	    @Id
	    @Column(name="email")
	    private String devEmail;
	    @Column(name="name")
	    private String devName;
	    
	    
	    
		public DeveloperCompositeKey() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public int getDevId() {
			return devId;
		}
		public void setDevId(int devId) {
			this.devId = devId;
		}
		public String getDevEmail() {
			return devEmail;
		}
		public void setDevEmail(String devEmail) {
			this.devEmail = devEmail;
		}
		public String getDevName() {
			return devName;
		}
		public void setDevName(String devName) {
			this.devName = devName;
		}
	
}
	
	    
