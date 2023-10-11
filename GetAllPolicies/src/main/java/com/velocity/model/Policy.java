package com.velocity.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer policyId;
	private String policyNumber;
	private Date policyEffectiveDate;
	private Date policyExpirydate;
	private String paymentOption;
	private Double totalAmount;
	private Boolean status;
	private Date createdDate;
	private String additionInfo;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Date getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}
	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}
	public Date getPolicyExpirydate() {
		return policyExpirydate;
	}
	public void setPolicyExpirydate(Date policyExpirydate) {
		this.policyExpirydate = policyExpirydate;
	}
	public String getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getAdditionInfo() {
		return additionInfo;
	}
	public void setAdditionInfo(String additionInfo) {
		this.additionInfo = additionInfo;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNumber=" + policyNumber + ", policyEffectiveDate="
				+ policyEffectiveDate + ", policyExpirydate=" + policyExpirydate + ", paymentOption=" + paymentOption
				+ ", totalAmount=" + totalAmount + ", status=" + status + ", createdDate=" + createdDate
				+ ", additionInfo=" + additionInfo + "]";
	}

}
