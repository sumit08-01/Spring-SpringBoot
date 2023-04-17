package com.app;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;



public class MyClass {

	public static void main(String[] args) {
		Resource resource=new FileSystemResource("src/app.xml");
	    BeanFactory factory=new XmlBeanFactory(resource);
	    
	    Invoice invoice1=(Invoice)factory.getBean("incoiceId");
	    Product product1=(Product)factory.getBean("Product1");
	    
	    System.out.println("InvoiceID" + invoice1.getInvoiceID());
	    List<Product> pList=invoice1.getpList();
		int total=0;
		for(Product p:pList) {
			System.out.println("Product Id:"+p.getProductId()+", Product Name:"+p.getProductName()+", Product Price:"+p.getProductPrice());
		
			total+=p.getProductPrice();
		}
		System.out.println("Invoice Total Amount:"+total);
	}
	

}
