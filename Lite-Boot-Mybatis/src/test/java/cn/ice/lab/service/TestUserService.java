package cn.ice.lab.service;

import cn.ice.lab.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Resource
    private IUserService userService;

    @Test
    public void testFindAll() {
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindOne() {
        User user = userService.findOne("EC2695D1FE6E43D0B2C5AD9D6D6BFA77");
        System.out.println(user);
    }
}
