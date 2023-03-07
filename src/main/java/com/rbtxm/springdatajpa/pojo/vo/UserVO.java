package com.rbtxm.springdatajpa.pojo.vo;

import lombok.Data;

import java.util.UUID;

@Data
public class UserVO {
    private UUID id;
    private String name;
    private String email;
}
