package com.example.ex6.repo;

import com.example.ex6.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User updateUserById(Long id, User user);
    void deleteUserById(Long id);
}
