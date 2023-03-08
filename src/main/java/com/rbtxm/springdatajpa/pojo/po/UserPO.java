package com.rbtxm.springdatajpa.pojo.po;

import com.rbtxm.springdatajpa.common.pojo.po.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;


@Data
@Entity
@Table(name = "sso_user")
public class UserPO extends BaseEntity {

    private String name;

    private String email;

}

