package com.velocity.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premium")
public class Premium {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer premiumId;
	private Long policyId;
	private String policyHolder;
	private Double installmentPremiumAmount;
	private Date policycommencementDate;
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
		return installmentPremiumAmount;
	}
	public void setInstallmentPremiumAmount(Double installmentPremiumAmount) {
		this.installmentPremiumAmount = installmentPremiumAmount;
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
				+ ", installmentPremiumAmount=" + installmentPremiumAmount + ", policycommencementDate="
				+ policycommencementDate + "]";
	}
     	

}
