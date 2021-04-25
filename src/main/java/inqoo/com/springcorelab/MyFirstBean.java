package inqoo.com.springcorelab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFirstBean {
    private final MySecondBean mySecondBean;
    @Autowired
    private MyThirdBean myThirdBean;
    private MyFourthBean myFourthBean;

    public MyFirstBean(MySecondBean mySecondBean) {
        this.mySecondBean = mySecondBean;
    }
    @Autowired
    public void setMyFourthBean(MyFourthBean myFourthBean) {
        this.myFourthBean = myFourthBean;
    }

    @Autowired
    private MyFifthBean myFifthBean;

    void callMyOtherBean(){
        mySecondBean.doSmt();
        myThirdBean.doSmt();
        myFourthBean.doSmt();
        myFifthBean.bean1();
        myFifthBean.bean2();
    }
}
