package com.velocity.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "billId")
	private Integer billId;
	@Column(name = "dueDate")
	private Date dueDate;
	@Column(name = "minimumPayment")
	private Double minimumPayment;
	@Column(name = "createdDate")
	private Date createdDate;
	@Column(name = "balance")
	private Double balance;
	@Column(name = "status")
	private Boolean status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Double getMinimumPayment() {
		return minimumPayment;
	}
	public void setMinimumPayment(Double minimumPayment) {
		this.minimumPayment = minimumPayment;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", billId=" + billId + ", dueDate=" + dueDate + ", minimumPayment=" + minimumPayment
				+ ", createdDate=" + createdDate + ", balance=" + balance + ", status=" + status + "]";
	}

	
}
