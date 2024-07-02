package org.gradeSystemBackend.controller;

import org.gradeSystemBackend.entity.User;
import org.gradeSystemBackend.entity.dto.UserLoginDTO;
import org.gradeSystemBackend.entity.vo.UserLoginVO;
import org.gradeSystemBackend.service.UserService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {

    public final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 用户登录
     *
     * @param userLoginDTO 用户登录参数
     * @return "用户信息"
     */
    @PostMapping(value = "/login")
    public UserLoginVO login(@RequestBody UserLoginDTO userLoginDTO) {
        userLoginDTO.isValidate();
        //用户信息
        User user = userService.queryByUsername(userLoginDTO.getUsername());
        //账号校验
        Assert.notNull(user, "用户不存在");
        //口令校验
        Assert.isTrue(userService.passwordCompare(user, userLoginDTO.getPassword()), "口令不正确");
        return userService.getUserByLogin(userLoginDTO);
    }
}
