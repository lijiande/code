import cn.finte.code.entity.user.User;
import cn.finte.code.service.Application;
import cn.finte.code.service.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

/**
 * Created by lijian on 2017/5/11.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
public class TestCase1 {

    @Inject
    private UserService userService;

    @Test
    public void test1(){
        EntityWrapper<User> ew = new EntityWrapper<>();
        ew.eq(User.USER_NAME,"string");
        User user = userService.selectOne(ew);
        System.out.println(user);

    }
}
