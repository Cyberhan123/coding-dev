package cn.hselfweb.jsp.coding.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
    User getByUserId(Long userId);
}
