package xuyf.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.Test;

public class MyDemo {

    @Test
    public void test(){
        //根据配置文件生成spring容器对象
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        MyBean3 bean = (MyBean3)context.getBean("myBean3");
//        bean.test();
//        bean.setName("张三");
//        System.out.println(bean.getName());
        MyServlet servlet = (MyServlet)context.getBean("myServlet");


    }
}
