package com.termii.model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	 

	@Column(name = "staffname", unique = true, nullable = false, length = 100)
	private String staffName;
	
 	@Column(name = "phonenumber", unique = true, nullable = false, length = 100)
	private Long phoneNumber;
 	
 	@Column(name = "email", unique = true, nullable = false, length = 100)
	private String email;
 
    @Column(name = "address", nullable = false, length = 100)
	private String address;
    
//    @OneToMany(mappedBy="staff")
//    private Set<Visitor> visitorid;

    public Staff() {
	
	}

	public Staff(int id, String staffName, Long phoneNumber, String email, String address) {
		super();
		this.id = id;
		this.staffName = staffName;
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


	public String getStaffName() {
		return staffName;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
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
	public int hashCode() {
		return Objects.hash(address, email, id, phoneNumber, staffName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(staffName, other.staffName);
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", staffName=" + staffName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + "]";
	}



	




	

 
}
