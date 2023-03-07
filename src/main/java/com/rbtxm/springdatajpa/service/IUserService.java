package com.rbtxm.springdatajpa.service;

import com.rbtxm.springdatajpa.pojo.dto.UserDTO;
import com.rbtxm.springdatajpa.pojo.dto.UserPageDTO;
import com.rbtxm.springdatajpa.pojo.vo.UserVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    UserVO addUser(UserDTO userDTO);

    Page<UserVO> getUserPage(UserPageDTO userPageDTO);
}
