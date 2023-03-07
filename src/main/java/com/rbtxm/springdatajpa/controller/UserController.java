package com.rbtxm.springdatajpa.controller;

import com.rbtxm.springdatajpa.pojo.dto.UserDTO;
import com.rbtxm.springdatajpa.pojo.dto.UserPageDTO;
import com.rbtxm.springdatajpa.pojo.vo.UserVO;
import com.rbtxm.springdatajpa.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Resource
    private IUserService iUserService;

    /**
     * 保存用户
     * @param userDTO
     * @return
     */
    @PostMapping(path = "/addUser")
    public UserVO addUser(@RequestBody UserDTO userDTO) {
        return iUserService.addUser(userDTO);
    }

    /**
     * 根据分页信息查询用户
     * @param userPageDTO
     * @return
     */
    @GetMapping(path = "/getUserPage")
    public Page<UserVO> getUserPage(@RequestBody UserPageDTO userPageDTO) {
        return iUserService.getUserPage(userPageDTO);
    }
}
