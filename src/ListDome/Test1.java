package ListDome;

import class01.emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
@Test
    public void test(){
    //加载配置文件
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("List.xml");

    System.out.println();
    //通过配置文件id得到bean对象
    bean bean = applicationContext.getBean("list", bean.class);

    System.out.println(bean);
}
}
