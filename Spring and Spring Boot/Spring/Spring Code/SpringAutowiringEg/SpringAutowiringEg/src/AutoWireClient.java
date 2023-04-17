/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author savits
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class AutoWireClient {
public static void main(String args[])
    {
        Resource xmlResource=new FileSystemResource("SpringAutowiringEg/src/applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(xmlResource);
        Employee employee=(Employee)factory.getBean("employeeBean");
        System.out.println(employee.getEmpId());
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
    }
}
