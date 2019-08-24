package com.hushnoon.bfm.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CascadeType;

@Entity
public class BatchDetail {
	
	@Id
	private int batchCode;
	private String courseCode;
	private String semesterCode;
	private String facultyName;
	private String supervisorName;
	private Date startDate;
	private Date endDate;
	
	public Set<BmsDetail> getBmsDetails() {
		return bmsDetails;
	}
	public void setBmsDetails(Set<BmsDetail> bmsDetails) {
		this.bmsDetails = bmsDetails;
	}
	@OneToMany
    @JoinColumn(name="batchCode")
    private Set<BmsDetail> bmsDetails;
	
	
	public int getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getSemesterCode() {
		return semesterCode;
	}
	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	

}
