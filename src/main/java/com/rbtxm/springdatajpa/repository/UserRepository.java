package com.rbtxm.springdatajpa.repository;

import com.rbtxm.springdatajpa.pojo.po.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<UserPO,Long> {
}
