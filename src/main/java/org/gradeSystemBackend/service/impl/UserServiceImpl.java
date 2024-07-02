package org.gradeSystemBackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.gradeSystemBackend.entity.User;
import org.gradeSystemBackend.entity.dto.UserLoginDTO;
import org.gradeSystemBackend.entity.vo.UserLoginVO;
import org.gradeSystemBackend.mapper.UserMapper;
import org.gradeSystemBackend.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public UserLoginVO getUserByLogin(UserLoginDTO userLoginDTO) {
        return this.baseMapper.getUserByLogin(userLoginDTO);
    }

    @Override
    public User queryByUsername(String username) {
        return this.baseMapper.queryByUsername(username);
    }

    @Override
    public boolean passwordCompare(User user, String password) {
        return user.getPassword().equals(password);
    }
}
