package com.rbtxm.springdatajpa.pojo.dto;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
public class UserPageDTO {
    private String name;
    private String email;
}
