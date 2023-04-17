/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author savits
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApplication
{
   public static void main(String [] args)
   {
      // Read the configuration file
      ApplicationContext ctx
          = new FileSystemXmlApplicationContext("SpringAOP/src/SpringConfig.xml");

      //Instantiate an object
      IBusinessLogic testObject = (IBusinessLogic) ctx.getBean("businesslogicbean");

      //Execute the public methods of the bean
      testObject.foo();

      try
      {
         testObject.bar();
      }
      catch(BusinessLogicException ble)
      {
         System.out.println("Caught BusinessLogicException");
      }
   }
}
