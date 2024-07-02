package org.gradeSystemBackend.controller;

import org.gradeSystemBackend.entity.Result;
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

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/login")
    public Result<?> login(@RequestBody UserLoginDTO userLoginDTO) {
        if(!userLoginDTO.isValidate().equals("验证通过")){
            return Result.error(userLoginDTO.isValidate());
        }

        User user = userService.queryByUsername(userLoginDTO.getUsername());
        if (user == null) {
            return Result.error("用户不存在");
        }

        if (!userService.passwordCompare(user, userLoginDTO.getPassword())) {
            return Result.error("口令不正确");
        }

        UserLoginVO userLoginVO = userService.getUserByLogin(userLoginDTO);
        return Result.success(userLoginVO);
    }
}
