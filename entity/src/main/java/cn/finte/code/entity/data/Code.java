package cn.finte.code.entity.data;

import cn.finte.code.core.model.BaseObject;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * Created by lijian on 2017/5/3.
 */
@TableName(value = "code")
public class Code extends BaseObject{

    /*主键*/
    public static final String ID = "id";
    @TableId(value = ID,type = IdType.UUID)
    private String id;

    /*用户ID*/
    public static final String USER_ID = "user_id";
    @TableField(value = USER_ID)
    private String userId;

    /*名字*/
    public static final String NAME = "name";
    @TableField(value = NAME)
    private String name;

    /*键*/
    public static final String KEY_WORD = "key_word";
    @TableField(value = KEY_WORD)
    private String keyWord;

    /*值*/
    public static final String VALUE_WORD = "value_word";
    @TableField(value = VALUE_WORD)
    private String valueWord;

    /*创建时间*/
    public static final String CREATE_TIME = "create_time";
    @TableField(value = CREATE_TIME)
    private Date createTime;

    /*修改时间*/
    public static final String MODIFY_TIME = "modify_time";
    @TableField(value = MODIFY_TIME)
    private Date modifyTime;

    /*星级*/
    public static final String STAR = "star";
    @TableField(value = STAR)
    private Integer star;

    /*备注*/
    public static final String REMARK = "remark";
    @TableField(value = REMARK)
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getValueWord() {
        return valueWord;
    }

    public void setValueWord(String valueWord) {
        this.valueWord = valueWord;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Code code = (Code) o;

        if (id != null ? !id.equals(code.id) : code.id != null) return false;
        if (userId != null ? !userId.equals(code.userId) : code.userId != null) return false;
        if (name != null ? !name.equals(code.name) : code.name != null) return false;
        if (keyWord != null ? !keyWord.equals(code.keyWord) : code.keyWord != null) return false;
        if (valueWord != null ? !valueWord.equals(code.valueWord) : code.valueWord != null) return false;
        if (createTime != null ? !createTime.equals(code.createTime) : code.createTime != null) return false;
        if (modifyTime != null ? !modifyTime.equals(code.modifyTime) : code.modifyTime != null) return false;
        if (star != null ? !star.equals(code.star) : code.star != null) return false;
        return remark != null ? remark.equals(code.remark) : code.remark == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (keyWord != null ? keyWord.hashCode() : 0);
        result = 31 * result + (valueWord != null ? valueWord.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (modifyTime != null ? modifyTime.hashCode() : 0);
        result = 31 * result + (star != null ? star.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", keyWord='" + keyWord + '\'' +
                ", valueWord='" + valueWord + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", star=" + star +
                ", remark='" + remark + '\'' +
                '}';
    }
}
