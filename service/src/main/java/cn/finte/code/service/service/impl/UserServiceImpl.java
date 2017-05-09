package cn.finte.code.service.service.impl;

import cn.finte.code.entity.user.User;
import cn.finte.code.service.mapper.UserMapper;
import cn.finte.code.service.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lijian on 2017/5/9.
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    UserMapper userMapper;

}