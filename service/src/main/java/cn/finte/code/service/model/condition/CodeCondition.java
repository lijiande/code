package cn.finte.code.service.model.condition;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

/**
 * Created by lijian on 2017/5/10.
 */
public class CodeCondition {

    @Size(max = 100)
    @ApiModelProperty(notes = "名字")
    private String name;

    @Size(max = 100)
    @ApiModelProperty(notes = "键")
    private String keyWord;

    @Size(max = 100)
    @ApiModelProperty(notes = "值")
    private String valueWord;

    @ApiModelProperty(notes = "星级")
    private Integer star;

    @Size(max = 400)
    @ApiModelProperty(notes = "备注")
    private String remark;

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
}
