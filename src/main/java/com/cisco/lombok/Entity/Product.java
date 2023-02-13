package com.cisco.lombok.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private double pprice;
	private String pcolor;
	
	
	
	
	

}
