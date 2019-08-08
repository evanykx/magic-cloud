package cn.ice.lab.controller;

import cn.ice.lab.entity.User;
import cn.ice.lab.service.IUserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestComtroller {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public String index() {
        Gson gson = new Gson();
        List<User> users = userService.findAll();
        return gson.toJson(users);
    }
}
