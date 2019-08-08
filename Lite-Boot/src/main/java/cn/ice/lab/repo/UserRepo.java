package cn.ice.lab.repo;

import cn.ice.lab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
