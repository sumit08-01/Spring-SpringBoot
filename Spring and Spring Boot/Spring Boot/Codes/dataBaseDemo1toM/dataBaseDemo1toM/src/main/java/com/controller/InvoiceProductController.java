package com.controller;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Invoice;
import com.model.InvoiceRepository;
import com.model.Product;
import com.model.productRepository;

@RestController
public class InvoiceProductController {

	@Autowired
	productRepository productRepository;
	
	@Autowired
	InvoiceRepository invoiceRepository;
	
	@RequestMapping("/findAllDetails")
	public Iterable<Invoice> getAllAccounts(){
		return invoiceRepository.findAll();	
	}
	
	@RequestMapping(value="/createAllDetails", method = RequestMethod.GET)
	public String createAllDetails() {
		

		Invoice i = new Invoice( new Date());		
		Product p1 = new Product("book", 5);
		Product p = new Product("pen", 4);
		
		
		List<Product> prods = new ArrayList<Product>();	
		prods.add(p1);
		prods.add(p);
		
		i.setProducts(prods);
		
		double total = 0;
		for(Product pr:i.getProducts()) {
			total = (total+pr.getProductPrice());
		}
		
		i.setInvoiceAmount(total);
		invoiceRepository.save(i);
		return "<html><body bgcolor='lightgreen'>Invoice And Product Are Added Successfully</body</html>";
		
	}
	
}
