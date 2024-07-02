package org.gradeSystemBackend.service;

import org.gradeSystemBackend.entity.User;
import org.gradeSystemBackend.entity.dto.UserLoginDTO;
import org.gradeSystemBackend.entity.vo.UserLoginVO;

public interface UserService {
    /**
     * 用户登录
     *
     * @param userLoginDTO 用户登录信息
     * @return "用户信息"
     */
    UserLoginVO getUserByLogin(UserLoginDTO userLoginDTO);

    User queryByUsername(String username);

    boolean passwordCompare(User user, String password);
}
