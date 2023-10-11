package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productdetails")
public class ProductDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private Integer id;
	private String pname;
	private Double price;
	private String description;
	
}
