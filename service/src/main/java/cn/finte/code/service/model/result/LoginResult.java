package cn.finte.code.service.model.result;

import cn.finte.code.core.model.BaseObject;

/**
 * Created by lijian on 2017/5/15.
 */
public class LoginResult extends BaseObject{

    private String x;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginResult result = (LoginResult) o;

        return x != null ? x.equals(result.x) : result.x == null;
    }

    @Override
    public int hashCode() {
        return x != null ? x.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "LoginResult{" +
                "x='" + x + '\'' +
                '}';
    }
}
