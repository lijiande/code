package cn.finte.code.service.service.impl;

import cn.finte.code.core.config.Constants;
import cn.finte.code.entity.user.User;
import cn.finte.code.service.mapper.UserMapper;
import cn.finte.code.service.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by lijian on 2017/5/9.
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @Autowired
    UserMapper userMapper;

    @Override
    public Boolean matchPassword(String password, String source) {
        return encoder.matches(addSalt(password),source);
    }

    @Override
    public String encoder(String password) {
        return encoder.encode(addSalt(password));
    }

    @Override
    public String addSalt(String str) {
        return str.concat(Constants.SALT);
    }
}
