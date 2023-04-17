package com.app;

import java.util.List;

public class Invoice {
		private int invoiceID;
		private float invoiceTotalAmount;
		private List<Product> pList;
		
		public Invoice() {
			
		}
		
		public List<Product> getpList() {
			return pList;
		}

		public void setpList(List<Product> pList) {
			this.pList = pList;
		}


		public int getInvoiceID() {
			return invoiceID;
		}

		public void setInvoiceID(int invoiceID) {
			this.invoiceID = invoiceID;
		}

		public float getInvoiceTotalAmount() {
			return invoiceTotalAmount;
		}

		public void setInvoiceTotalAmount(float invoiceTotalAmount) {
			this.invoiceTotalAmount = invoiceTotalAmount;
		}
}
