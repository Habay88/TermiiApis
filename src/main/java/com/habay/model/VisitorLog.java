package com.termii.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "visitorlog")
public class VisitorLog {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	 
	 @Column(name="create_time")
		private LocalTime createTime;
	 
	  private String reasonForVisit;
	  
	  private int staffId;
	  
		private int visitorId;
		


		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		

		public String getReasonForVisit() {
			return reasonForVisit;
		}

		public void setReasonForVisit(String reasonForVisit) {
			this.reasonForVisit = reasonForVisit;
		}

		public LocalTime getCreateTime() {
			return createTime;
		}

		public void setCreateTime(LocalTime createTime) {
			this.createTime = createTime;
		}

		public int getStaffId() {
			return staffId;
		}

		public void setStaffId(int staffId) {
			this.staffId = staffId;
		}

		public int getVisitorId() {
			return visitorId;
		}

		public void setVisitorId(int visitorId) {
			this.visitorId = visitorId;
		}

		public VisitorLog(int id, LocalTime String, String reasonForVisit, int staffId, int visitorId) {
			super();
			this.id = id;
			this.createTime = String;
			this.reasonForVisit = reasonForVisit;
			this.staffId = staffId;
			this.visitorId = visitorId;
		}

		public VisitorLog() {
			super();
		}

		

		@Override
		public String toString() {
			return "VisitorLog [id=" + id + ", createTime=" + createTime + ", reasonForVisit=" + reasonForVisit
					+ ", staffId=" + staffId + ", visitorId=" + visitorId + "]";
		}

		
		

	
		
		
}
