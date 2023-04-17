/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author savits
 */
import org.springframework.aop.ThrowsAdvice;
import java.lang.reflect.Method;

public class LoggingThrowsAdvice implements ThrowsAdvice
{
   public void afterThrowing(Method method, Object[] args, Object target, Throwable subclass)
   {
      System.out.println("Logging that a " + subclass + "Exception was thrown.");
   }
}