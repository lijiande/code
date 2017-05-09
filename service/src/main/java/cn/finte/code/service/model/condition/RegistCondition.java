package cn.finte.code.service.model.condition;

import com.google.common.base.Strings;

/**
 * Created by lijian on 2017/5/9.
 */
public class RegistCondition {

    private String userName;

    private String nick;

    private String password;

    private String icon;

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
