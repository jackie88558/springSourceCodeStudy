package main.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Jackie Xie on 2018/5/11.
 */
@Component("b1")
public class B1 implements B {
    @Autowired
    private C c;
}
