import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Client {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Spring3AnnoEg.class);
        System.out.println("calling Beanmethod: displayHello()");
        Hello bean1=(Hello)context.getBean("helloCreator");
        bean1.displayHello();
    }
}


