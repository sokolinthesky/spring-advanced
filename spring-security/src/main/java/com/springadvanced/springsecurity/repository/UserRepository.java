package com.springadvanced.springsecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springadvanced.springsecurity.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getUsersByName(@Param("name") String name);

    User getUserByEmail(@Param("email") String email);
}
