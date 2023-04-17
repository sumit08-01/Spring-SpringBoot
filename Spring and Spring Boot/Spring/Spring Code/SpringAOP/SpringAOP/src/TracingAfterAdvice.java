/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author savits
 */
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class TracingAfterAdvice implements AfterReturningAdvice
{
   public void afterReturning(Object object, Method m, Object[] args, Object target) throws Throwable
   {
       System.out.println("Hello world! (by " + this.getClass().getName() + ")");
   }
}
