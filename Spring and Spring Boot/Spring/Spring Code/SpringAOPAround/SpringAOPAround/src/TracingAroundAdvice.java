
import java.lang.reflect.Method;


import org.aopalliance.intercept.*; 

public class TracingAroundAdvice implements MethodInterceptor 
{
public Object invoke(MethodInvocation method) throws Throwable 
{ 
	long start = System.currentTimeMillis(); 
	try { 
		Object result = method.proceed(); //pass the control to the actual method-foo()
		return result; } 
	finally { 
			long end = System.currentTimeMillis(); 
			long timeMs = end - start; 
			System.out.println("Method: " + method.toString() + " took: " + timeMs+"ms."); 
			} 
	} 
} 


