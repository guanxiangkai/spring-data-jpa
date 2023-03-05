package com.rbtxm.springdatajpa.repository;

import com.rbtxm.springdatajpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long> {
}