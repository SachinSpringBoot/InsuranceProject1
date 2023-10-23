package com.velocity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TrafficViolation")
public class TrafficViolation {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="Id")
private Integer id;
@Column(name="trafficViolationQuestion")
private String trafficViolationQuestion;
@Column(name="trafficViolationCode")
private String trafficViolationCode;
@Column(name="traffiecViolationPoint")
private String traffiecViolationPoint;
@Column(name="description",nullable=false)
private String description;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTrafficViolationQuestion() {
	return trafficViolationQuestion;
}
public void setTrafficViolationQuestion(String trafficViolationQuestion) {
	this.trafficViolationQuestion = trafficViolationQuestion;
}
public String getTrafficViolationCode() {
	return trafficViolationCode;
}
public void setTrafficViolationCode(String trafficViolationCode) {
	this.trafficViolationCode = trafficViolationCode;
}
public String getTraffiecViolationPoint() {
	return traffiecViolationPoint;
}
public void setTraffiecViolationPoint(String traffiecViolationPoint) {
	this.traffiecViolationPoint = traffiecViolationPoint;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "TrafficViolation [id=" + id + ", trafficViolationQuestion=" + trafficViolationQuestion
			+ ", trafficViolationCode=" + trafficViolationCode + ", traffiecViolationPoint=" + traffiecViolationPoint
			+ ", description=" + description + "]";
}  

}
