package com.example.ex5.repo;

import com.example.ex5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User updateUserById(Long id, User user);
    void deleteUserById(Long id);
}
