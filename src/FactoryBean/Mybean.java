package FactoryBean;

import ListDome.stu;
import org.springframework.beans.factory.FactoryBean;

public class Mybean implements FactoryBean<stu> {
    @Override
    public stu getObject() throws Exception {
        stu stu = new stu();
        stu.setSName("123");
        return stu;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
