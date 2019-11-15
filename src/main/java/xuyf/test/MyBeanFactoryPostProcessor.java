package xuyf.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/*
    实现BeanFactoryPostProcessor接口可以对bean工厂进行个性化操作，ConfigurableListableBeanFactory就是传入的bean工厂
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
//        for(String name:names){
//            System.out.println(name);
//        }
        //BeanDefinition是描述bean的类，包括bean的名称、是否单例、是否懒加载等
//        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("myBean");
//        System.out.println(beanDefinition.getBeanClassName());
    }
}
