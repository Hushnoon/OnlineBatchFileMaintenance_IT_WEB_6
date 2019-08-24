package com.hushnoon.bfm.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BmsDetail {

	private int bmsEntryCode;
	private Date entryDate;
	private String observation;
	private String status;
	private String action;
	private Date deadlineDate;
	private String responsiblePerson;
	
	public BatchDetail getBatch() {
		return batch;
	}
	public void setBatch(BatchDetail batch) {
		this.batch = batch;
	}
	@ManyToOne
    private BatchDetail batch;
	
	public int getBmsEntryCode() {
		return bmsEntryCode;
	}
	public void setBmsEntryCode(int bmsEntryCode) {
		this.bmsEntryCode = bmsEntryCode;
	}
	
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getDeadlineDate() {
		return deadlineDate;
	}
	public void setDeadlineDate(Date deadlineDate) {
		this.deadlineDate = deadlineDate;
	}
	public String getResponsiblePerson() {
		return responsiblePerson;
	}
	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}
	
	
}
