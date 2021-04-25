package inqoo.com.springcorelab.package2;

import inqoo.com.springcorelab.Beans;
import org.springframework.context.annotation.Bean;

public class OtherBean2 {
    @Bean
    Beans otherBean2(){
        return new Beans();
    }
}
