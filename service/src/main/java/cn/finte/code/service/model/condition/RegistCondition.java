package cn.finte.code.service.model.condition;

import com.google.common.base.Strings;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by lijian on 2017/5/9.
 */
public class RegistCondition {

    @NotEmpty(message = "用户名不能为空")
    @Size(min = 2,max = 10,message = "用户名在2-10个字符")
    @ApiModelProperty(notes = "用户名")
    private String userName;

    @Size(max = 10,message = "昵称不超过10个字符")
    @ApiModelProperty(notes = "昵称")
    private String nick;

    @NotEmpty(message = "密码不能为空")
    @Size(min = 6,max = 20,message = "密码在6-20个字符")
    @ApiModelProperty(notes = "密码")
    private String password;

    @ApiModelProperty(notes = "头像")
    private String icon;

    @ApiModelProperty(notes = "手势")
    private String finger;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getFinger() {
        return finger;
    }

    public void setFinger(String finger) {
        this.finger = finger;
    }
    public boolean isPassValited(){
        if(Strings.isNullOrEmpty(this.userName) || Strings.isNullOrEmpty(this.password)){
            return false;
        }
        return true;
    }
}
