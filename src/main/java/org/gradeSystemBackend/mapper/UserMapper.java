package org.gradeSystemBackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.gradeSystemBackend.entity.User;
import org.gradeSystemBackend.entity.dto.UserLoginDTO;
import org.gradeSystemBackend.entity.vo.UserLoginVO;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 用户登录
     *
     * @param userLoginDTO 用户登录信息
     * @return "用户信息"
     */
    UserLoginVO getUserByLogin(UserLoginDTO userLoginDTO);

    User queryByUsername(String username);

}
