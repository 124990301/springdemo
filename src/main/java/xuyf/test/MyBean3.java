package xuyf.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean3 {
    //不使用成员变量可以不注入
    @Autowired
    private MyBean myBean;

    public void test(){
        myBean.setName("lisi");
        System.out.println(myBean.getName());
    }
}
