package com.rbtxm.springdatajpa.service.impl;

import com.rbtxm.springdatajpa.pojo.dto.UserDTO;
import com.rbtxm.springdatajpa.pojo.User;
import com.rbtxm.springdatajpa.pojo.vo.UserVO;
import com.rbtxm.springdatajpa.repository.UserRepository;
import com.rbtxm.springdatajpa.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("iUserService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserRepository userRepository;
    /**
     * @param user
     * @return
     */
    @Override
    public UserVO addUser(UserDTO user) {
        User userDO = new User();
        BeanUtils.copyProperties(userDO,user);
        userDO = userRepository.save(userDO);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userVO,userDO);
        return userVO;
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<UserVO> getUserPage(Pageable pageable) {
        Page<User> userDOPage =  userRepository.findAll(pageable);
       List<UserVO> userVOS = new ArrayList<>();
        BeanUtils.copyProperties(userVOS,userDOPage.getContent());
        return new PageImpl<>(userVOS,pageable,userDOPage.getTotalPages());
    }
}
