package org.xuxw.mybatis.tk.service;

import org.springframework.stereotype.Service;
import org.xuxw.mybatis.tk.mapper.UserMapper;
import org.xuxw.mybatis.tk.model.User;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public void add() {
        User u = new User();
        u.setName("zhangsan");
        u.setPassword("xxx");
        userMapper.insert(u);
    }

    public void getOne() {
        User u = userMapper.selectByPrimaryKey("");
    }

    public User getByNameDemo1(String name) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("name", name);
        List<User> matchList = userMapper.selectByExample(example);
        if (matchList.size() > 0)
            return matchList.get(0);
        return null;
    }

    public User getByNameDemo2(String name) {
        User condition = new User();
        condition.setName(name);
        List<User> matchList = userMapper.select(condition);
        if (matchList.size() > 0)
            return matchList.get(0);
        return null;
    }
}
