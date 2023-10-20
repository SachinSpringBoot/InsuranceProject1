package com.velocity.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="premium")
public class Premium {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer premiumId;
	private Long policyId;
	private String policyHolder;
	private Double InstallmentPremiumAmount;
	private Date policycommencementDate;
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(Integer premiumId) {
		this.premiumId = premiumId;
	}
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public String getPolicyHolder() {
		return policyHolder;
	}
	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}
	public Double getInstallmentPremiumAmount() {
		return InstallmentPremiumAmount;
	}
	public void setInstallmentPremiumAmount(Double installmentPremiumAmount) {
		InstallmentPremiumAmount = installmentPremiumAmount;
	}
	public Date getPolicycommencementDate() {
		return policycommencementDate;
	}
	public void setPolicycommencementDate(Date policycommencementDate) {
		this.policycommencementDate = policycommencementDate;
	}
	@Override
	public String toString() {
		return "Premium [premiumId=" + premiumId + ", policyId=" + policyId + ", policyHolder=" + policyHolder
				+ ", InstallmentPremiumAmount=" + InstallmentPremiumAmount + ", policycommencementDate="
				+ policycommencementDate + "]";
	}
	
	
}
