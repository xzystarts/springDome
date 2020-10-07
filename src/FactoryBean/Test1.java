package FactoryBean;

import ListDome.bean;
import ListDome.stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
@Test
    public void test(){
    //加载配置文件
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("Factory.xml");

    //工厂bean(xml文件中配置的bean与返回bean不同)
    //通过配置文件id得到bean对象
    stu bean = applicationContext.getBean("bean", stu.class);

    System.out.println(bean);
}
}
