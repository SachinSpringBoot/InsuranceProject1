package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SettlementDetails")
public class SettlementDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String date;
	private Double amount;
	private Integer claim_id;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(Integer claim_id) {
		this.claim_id = claim_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "SettlementDetails [id=" + id + ", date=" + date + ", amount=" + amount + ", claim_id=" + claim_id
				+ ", status=" + status + "]";
	}
	


}
