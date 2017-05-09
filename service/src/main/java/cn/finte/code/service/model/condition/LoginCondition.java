package cn.finte.code.service.model.condition;

import com.mysql.jdbc.StringUtils;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by lijian on 2017/5/9.
 */
public class LoginCondition {
    @ApiModelProperty(notes = "用户名")
    private String userName;

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
