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
@RequestMapping(path = "/api/v1")
public class UserController {
    @Resource
    private IUserService iUserService;

    /**
     * 保存用户
     * @param user
     * @return
     */
    @PostMapping(path = "addUser",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public UserVO addUser(@RequestBody UserDTO user) {
        return iUserService.addUser(user);
    }

    /**
     * 根据分页信息查询用户
     * @param pageable
     * @return
     */
    @GetMapping(path = "getUserPage")
    @ResponseBody
    public Page<UserVO> getUserPage(Pageable pageable) {
        return iUserService.getUserPage(pageable);
    }
}
