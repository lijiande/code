package cn.finte.code.service.web;

import cn.finte.code.core.config.Constants;
import cn.finte.code.core.model.Result;
import cn.finte.code.entity.user.User;
import cn.finte.code.service.model.condition.LoginCondition;
import cn.finte.code.service.model.condition.RegistCondition;
import cn.finte.code.service.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by lijian on 2017/5/9.
 */
@RestController
@RequestMapping("/api/systemController")
@Api(value = "系统级操作", description = "系统级操作、注册、登录")
public class SystemController {

    private final Logger log = LoggerFactory.getLogger(SystemController.class);

    @Inject
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录", notes = "登录操作")
    public Result login(@Validated @RequestBody LoginCondition condition){
        try {
            if(Objects.isNull(condition)){
                return new Result(Result.ReturnValue.FAILURE, Constants.ERROR);
            }
            if(!condition.isPassValited()){
                return new Result(Result.ReturnValue.FAILURE,Constants.PARAM_INCOMPLETE);
            }
            EntityWrapper<User> ew = new EntityWrapper<>();
            ew.eq(User.USER_NAME,condition.getUserName());
            User user = userService.selectOne(ew);
            if(Objects.isNull(user)){
                return new Result(Result.ReturnValue.FAILURE,"该用户不存在");
            }
            if(userService.matchPassword(condition.getPassword(),user.getPassword())){
                return new Result(Result.ReturnValue.SUCCESS,"");
            }
            return new Result(Result.ReturnValue.FAILURE,Constants.ERROR,"密码错误");
        }catch (Exception e){
            log.error(e.getMessage(),e);
            return new Result(Result.ReturnValue.FAILURE, Constants.ERROR);
        }

    }

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    @ApiOperation(value = "注册", notes = "注册")
    public Result regist(@Validated @RequestBody RegistCondition condition){
        try {
            if(!condition.isPassValited()){
                return new Result(Result.ReturnValue.FAILURE,Constants.PARAM_INCOMPLETE);
            }
            EntityWrapper<User> ew = new EntityWrapper<>();
            ew.eq(User.USER_NAME,condition.getUserName());
            int count = userService.selectCount(ew);
            if(count != 0){
                return new Result(Result.ReturnValue.FAILURE,"该用户已存在");
            }
            User user = new User();
            BeanUtils.copyProperties(condition,user);
            user.setPassword(userService.encoder(user.getPassword()));
            user.setCreateTime(new Date());
            user.setScore(0);
            user.setToken(UUID.randomUUID().toString());
            boolean result = userService.insert(user);
            if(result){
                return new Result(Result.ReturnValue.SUCCESS,"");
            }
            return new Result(Result.ReturnValue.FAILURE, Constants.ERROR,"注册失败");
        }catch (Exception e) {
            log.error(e.getMessage(),e);
            return new Result(Result.ReturnValue.FAILURE, Constants.ERROR);
        }
    }

}
