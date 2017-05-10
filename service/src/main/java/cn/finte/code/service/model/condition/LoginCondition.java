package cn.finte.code.service.model.condition;

import com.mysql.jdbc.StringUtils;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by lijian on 2017/5/9.
 */
public class LoginCondition {
    @NotEmpty(message = "用户名不能为空")
    @Size(min = 2,max = 10,message = "用户名在2-10个字符")
    @ApiModelProperty(notes = "用户名")
    private String userName;

    @NotEmpty(message = "密码不能为空")
    @Size(min = 6,max = 20,message = "密码在6-20个字符")
    @ApiModelProperty(notes = "密码")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isPassValited(){
        if(StringUtils.isNullOrEmpty(this.userName) || StringUtils.isNullOrEmpty(this.password)){
            return false;
        }
        return true;
    }
}
