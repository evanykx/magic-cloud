package cn.ice.lab.service.impl;

import cn.ice.lab.entity.User;
import cn.ice.lab.mapper.UserMapper;
import cn.ice.lab.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userRepo;

    @Override
    public User findOne(String s) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(String s) {
        //TODO
    }
}
