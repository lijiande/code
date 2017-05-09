package cn.finte.code.entity.user;

import cn.finte.code.core.model.BaseObject;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * Created by lijian on 2017/5/3.
 */
@TableName(value = "user")
public class User extends BaseObject {

    @TableId(value = "id")
    private String id;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "nick")
    private String nick;

    @TableField(value = "password")
    private String password;

    @TableField(value = "icon")
    private String icon;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "score")
    private Integer score;

    @TableField(value = "token")
    private String token;

    @TableField(value = "finger")
    private String finger;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFinger() {
        return finger;
    }

    public void setFinger(String finger) {
        this.finger = finger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (nick != null ? !nick.equals(user.nick) : user.nick != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (icon != null ? !icon.equals(user.icon) : user.icon != null) return false;
        if (createTime != null ? !createTime.equals(user.createTime) : user.createTime != null) return false;
        if (score != null ? !score.equals(user.score) : user.score != null) return false;
        if (token != null ? !token.equals(user.token) : user.token != null) return false;
        return finger != null ? finger.equals(user.finger) : user.finger == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (nick != null ? nick.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (finger != null ? finger.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", icon='" + icon + '\'' +
                ", createTime=" + createTime +
                ", score=" + score +
                ", token='" + token + '\'' +
                ", finger='" + finger + '\'' +
                '}';
    }
}
