package org.xuxw.mybatis.tk.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.xuxw.mybatis.tk.model.User;
import org.xuxw.mybatis.tk.service.UserService;

public class UserServiceTest extends BaseApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testAdd() {
        userService.add();
    }

    @Test
    public void testGetByNameDemo1() {
        User user = userService.getByNameDemo1("zhangsan");
        Assert.assertNotNull(user);
    }

    @Test
    public void testGetByNameDemo2() {
        User user = userService.getByNameDemo2("zhangsan");
        Assert.assertNotNull(user);
    }
}
