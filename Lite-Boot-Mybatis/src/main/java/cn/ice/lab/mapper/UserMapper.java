package cn.ice.lab.mapper;

import cn.ice.lab.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    User findOne(String id);
    List<User> findAll();
}
