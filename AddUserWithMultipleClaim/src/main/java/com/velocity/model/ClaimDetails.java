package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claimDetails")
public class ClaimDetails {
//Id,Claim id,Policy id,Claim status,Claim amount
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer claim_id;
	private Integer policy_id;
	private String claim_status;
	private Double claim_amount;
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(Integer claim_id) {
		this.claim_id = claim_id;
	}
	public Integer getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(Integer policy_id) {
		this.policy_id = policy_id;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	public Double getClaim_amount() {
		return claim_amount;
	}
	public void setClaim_amount(Double claim_amount) {
		this.claim_amount = claim_amount;
	}
	@Override
	public String toString() {
		return "ClaimDetails [claim_id=" + claim_id + ", policy_id=" + policy_id + ", claim_status=" + claim_status
				+ ", claim_amount=" + claim_amount + "]";
	}
	

}
