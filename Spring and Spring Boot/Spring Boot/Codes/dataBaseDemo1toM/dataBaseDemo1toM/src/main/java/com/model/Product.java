package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

			
		@Id
		@GeneratedValue
		private Integer productId;
		private String productName;
		private double productPrice;
		
		public Product() {
			super();	
		}
		
		public Product(String productName, double productPrice) {
			super();
			this.productName = productName;
			this.productPrice = productPrice;
		}
		
		public Integer getProductId() {
			return productId;
		}

		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}

		


		
		
		
}
