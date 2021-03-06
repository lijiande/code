package cn.finte.code.service.service;

import cn.finte.code.entity.user.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * Created by lijian on 2017/5/5.
 */
public interface UserService extends IService<User> {

    Boolean matchPassword (String password ,String source);

    String encoder (String password);

    String addSalt (String str);

    User getUserByToken (String token);
}
