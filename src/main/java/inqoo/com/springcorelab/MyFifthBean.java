package inqoo.com.springcorelab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyFifthBean {
    @Bean
    MyFifthBean bean1(){
        System.out.println("MyFifthBean1");
        return new MyFifthBean();
    }
    @Bean
    MyFifthBean bean2(){
        System.out.println("MyFifthBean2");
        return new MyFifthBean();
    }
}
