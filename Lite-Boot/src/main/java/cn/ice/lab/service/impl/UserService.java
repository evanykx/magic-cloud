package cn.ice.lab.service.impl;

import cn.ice.lab.entity.User;
import cn.ice.lab.repo.UserRepo;
import cn.ice.lab.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User findOne(String s) {
        return userRepo.getOne(s);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User save(User entity) {
        return userRepo.save(entity);
    }

    @Override
    public User update(User entity) {
        return userRepo.save(entity);
    }

    @Override
    public void delete(String s) {
        userRepo.deleteById(s);
    }
}
