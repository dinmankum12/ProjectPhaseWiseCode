
package com.dinesh;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@javax.persistence.Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name="productId")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	
	@Column(name = "productName")
	String productName;
	
	@Column(name = "productPrice")
	int productPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	public Product(int productId ,String productName, int productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
