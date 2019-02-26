package org.xuxw.mybatis.tk.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.xuxw.mybatis.tk.BaseApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BaseApplication.class)
@ComponentScan(basePackages = {"com.oasis.biz.test"})
public class BaseApplicationTests {


}
