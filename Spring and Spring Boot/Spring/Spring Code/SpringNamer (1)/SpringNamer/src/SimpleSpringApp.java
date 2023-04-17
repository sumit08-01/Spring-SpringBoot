import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
public class SimpleSpringApp {
    public static void main(String args[])
    {
        Resource namerXmlFile=new FileSystemResource("src/Namer.xml");
        BeanFactory factory=new XmlBeanFactory(namerXmlFile);
        
        Namer namer=(Namer)factory.getBean("namerId");
        System.out.println(namer.getName());         
        System.out.println(namer); 
        
        
        Namer namer1=(Namer)factory.getBean("namerId");
        System.out.println(namer1.getName());         
        System.out.println(namer1); 
        
      
      
    }
}


