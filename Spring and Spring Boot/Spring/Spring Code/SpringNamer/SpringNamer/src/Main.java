import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		 Resource resource=new FileSystemResource("SpringNamer/src/app.xml");
		    BeanFactory factory=new XmlBeanFactory(resource);
		    
		    Namer namer = (Namer)factory.getBean("Namerid");
		    System.out.println(namer.getName());
	}
}
