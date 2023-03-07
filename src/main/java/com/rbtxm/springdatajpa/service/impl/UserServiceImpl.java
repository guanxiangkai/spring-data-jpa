package com.rbtxm.springdatajpa.service.impl;

import com.rbtxm.springdatajpa.pojo.dto.UserDTO;
import com.rbtxm.springdatajpa.pojo.dto.UserPageDTO;
import com.rbtxm.springdatajpa.pojo.po.UserPO;
import com.rbtxm.springdatajpa.pojo.vo.UserVO;
import com.rbtxm.springdatajpa.repository.UserRepository;
import com.rbtxm.springdatajpa.service.IUserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service("iUserService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserRepository userRepository;
    /**
     * @param userDTO
     * @return
     */
    @Override
    public UserVO addUser(UserDTO userDTO) {
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(userDTO,userPO);
        userPO = userRepository.save(userPO);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userPO,userVO);
        return userVO;
    }

    /**
     * @param userPageDTO
     * @return
     */
    @Override
    public Page<UserVO> getUserPage(UserPageDTO userPageDTO) {
        return null;
    }
}
