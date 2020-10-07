import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDo {

    @Test
    public void test1(){

        //加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("user.xml");


        //通过配置文件id得到bean对象
        user userDome = applicationContext.getBean("userbean", user.class);
        userDome.test();
        System.out.println(userDome);
    }

}
