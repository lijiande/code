package cn.finte.code.service.model.result;

import cn.finte.code.core.model.BaseObject;
import cn.finte.code.entity.data.Code;

import java.util.List;

/**
 * Created by lijian on 2017/5/22.
 */
public class SyncResult extends BaseObject{

    /*新增数据*/
    private List<Code> addList;

    /*更新数据*/
    private List<Code> updateList;

    /*删除数据*/
    private List<String> deleteList;

    /*更新签名id*/
    private List<String> signList;

    /*更新的sign*/
    private String sign;

    public List<Code> getAddList() {
        return addList;
    }

    public void setAddList(List<Code> addList) {
        this.addList = addList;
    }

    public List<Code> getUpdateList() {
        return updateList;
    }

    public void setUpdateList(List<Code> updateList) {
        this.updateList = updateList;
    }

    public List<String> getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(List<String> deleteList) {
        this.deleteList = deleteList;
    }

    public List<String> getSignList() {
        return signList;
    }

    public void setSignList(List<String> signList) {
        this.signList = signList;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SyncResult that = (SyncResult) o;

        if (addList != null ? !addList.equals(that.addList) : that.addList != null) return false;
        if (updateList != null ? !updateList.equals(that.updateList) : that.updateList != null) return false;
        if (deleteList != null ? !deleteList.equals(that.deleteList) : that.deleteList != null) return false;
        if (signList != null ? !signList.equals(that.signList) : that.signList != null) return false;
        return sign != null ? sign.equals(that.sign) : that.sign == null;
    }

    @Override
    public int hashCode() {
        int result = addList != null ? addList.hashCode() : 0;
        result = 31 * result + (updateList != null ? updateList.hashCode() : 0);
        result = 31 * result + (deleteList != null ? deleteList.hashCode() : 0);
        result = 31 * result + (signList != null ? signList.hashCode() : 0);
        result = 31 * result + (sign != null ? sign.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SyncResult{" +
                "addList=" + addList +
                ", updateList=" + updateList +
                ", deleteList=" + deleteList +
                ", signList=" + signList +
                ", sign='" + sign + '\'' +
                '}';
    }
}
