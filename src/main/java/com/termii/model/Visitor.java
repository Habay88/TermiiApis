package com.termii.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "visitor")
public class Visitor {



		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	

		@Column(name = "visitorname", unique = true, nullable = false, length = 100)
		private String visitorName;
		
	 	@Column(name = "phonenumber", unique = true, nullable = false, length = 100)
		private Long phoneNumber;
	 	
	 	@Column(name = "email", unique = true, nullable = false, length = 100)
		private String email;
	 
	    @Column(name = "address", nullable = false, length = 100)
		private String address;
	    
	   

		public Visitor() {

		}

		public Visitor(int id, String visitorName, Long phoneNumber, String email, String address) {
			super();
			this.id = id;
			this.visitorName = visitorName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.address = address;
			
		}

		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getVisitorName() {
			return visitorName;
		}

		public void setVisitorName(String visitorName) {
			this.visitorName = visitorName;
		}

		public Long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Visitor [id=" + id + ", visitorName=" + visitorName + ", phoneNumber=" + phoneNumber + ", email="
					+ email + ", address=" + address + "]";
		}

		

		

		
	    
}
