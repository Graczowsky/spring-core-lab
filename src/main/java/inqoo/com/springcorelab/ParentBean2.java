package inqoo.com.springcorelab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParentBean2 {
    private Child child = new Child();

    @Autowired
    public void childSetter(Child child){
        this.child = child;
        System.out.println("Parent 2");
    }
}
