package cn.finte.code.service.config;

import cn.finte.code.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lijian on 2017/5/11.
 */
public class BaseController {

    @Autowired
    protected UserService userService;

    protected String checkUser(String token){
        return null;
    }
}
