package inqoo.com.springcorelab;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyFourthBean {
    void doSmt(){
        System.out.println("Hello from FourthBean");
    }
}
