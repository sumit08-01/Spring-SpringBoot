import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Bar {
    @Autowired
    @Qualifier(value="foo2")
    private Foo foo1;

    @Resource(name="foo1")
    private Foo foo2;

    public Foo getFoo1() {
        return foo1;
    }

    public void setFoo1(Foo foo1) {
        this.foo1 = foo1;
    }

    public void printAll()
    {
        System.out.println(foo1.getName()); //martin
        System.out.println(foo2.getName()); //steve
    }

}
