package com.model;

import java.util.Date;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Invoice {
		
		@Id
		@GeneratedValue
		private Integer invoiceId;
		private Date invoiceDate;
		private double invoiceAmount;
		
		@OneToMany(cascade = CascadeType.ALL)
		private List<Product> products;
		
		public Invoice() {
			super();
		}

		

		public Invoice( Date invoiceDate) {
			super();
		
			this.invoiceDate = invoiceDate;
//			this.invoiceAmount = invoiceAmount;
			
		}



		public Integer getInvoiceId() {
			return invoiceId;
		}

		public void setInvoiceId(Integer invoiceId) {
			this.invoiceId = invoiceId;
		}

		public Date getInvoiceDate() {
			return invoiceDate;
		}

		public void setInvoiceDate(Date invoiceDate) {
			this.invoiceDate = invoiceDate;
		}

		public double getInvoiceAmount() {
			return invoiceAmount;
		}

		public void setInvoiceAmount(double total) {
			this.invoiceAmount = total;
		}

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}

		@Override
		public String toString() {
			return "Invoice [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", invoiceAmount="
					+ invoiceAmount + ", products=" + products + "]";
		}
		
		

		
}
