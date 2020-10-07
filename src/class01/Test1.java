package class01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
@Test
    public void test(){
    //加载配置文件
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("emp2.xml");


    //通过配置文件id得到bean对象
    emp userbean = applicationContext.getBean("emp", emp.class);
    userbean.add();
    System.out.println(userbean);
    System.out.println("分支1");
}
}
