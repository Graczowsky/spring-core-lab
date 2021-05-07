package inqoo.com.springcorelab;
import org.springframework.stereotype.Component;

@Component
public class ParentBean1 {
    private final Child child;

    public ParentBean1(Child child) {
        this.child = child;
        System.out.println("Parent 1 ");
    }
}
