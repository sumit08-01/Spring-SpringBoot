package com.Employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
		Resource EmpXmlFile=new FileSystemResource("src/main/java/Employee.xml");
        BeanFactory factory=new XmlBeanFactory(EmpXmlFile);
       
        Employee EmpName = (Employee)factory.getBean("nameid");
       
        System.out.println(EmpName.getEmpName());   
        System.out.println(EmpName.getEmpEmail());
        System.out.println(EmpName.getEmpLocation());   
    
	}

}
