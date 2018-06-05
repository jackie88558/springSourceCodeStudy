package main.model;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Jackie Xie on 2018/5/9.
 */
@Component
public class A implements BeanNameAware {

    @Autowired
    private B b;
    @Autowired
    private C c;

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName() execute!");
    }
}
