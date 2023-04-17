public class BusinessLogic implements IBusinessLogic
{
     public void foo()
     {
       System.out.println("Inside BusinessLogic.foo() method");
     }

     public void bar() throws BusinessLogicException
     {
        System.out.println("Inside BusinessLogic.bar() method");
        throw new BusinessLogicException();
     }
}
