package com.velocity.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private String mobileNo;
	private String city;
	@OneToMany(mappedBy ="userId" )
	private List<Policy> plist;
	@OneToMany(mappedBy = "userId")
	private List<Premium> prelist;
	
	public List<Policy> getPlist() {
		return plist;
	}
	public void setPlist(List<Policy> plist) {
		this.plist = plist;
	}
	public List<Premium> getPrelist() {
		return prelist;
	}
	public void setPrelist(List<Premium> prelist) {
		this.prelist = prelist;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", city=" + city
				+ "]";
	}
	
}
