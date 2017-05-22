package cn.finte.code.core.dict;

/**
 * Created by lijian on 2017/5/4.
 */
public class DataDict {

    public enum CodeType {

    }

    public enum CodeStar {
        ONE(1,"一星"),TWO(2,"二星"),THREE(3,"三星");

        private Integer value;
        private String remark;

        CodeStar(Integer value,String remark) {
            this.value = value;
            this.remark = remark;
        }

        public Integer getValue() {
            return value;
        }

        public String getRemark() {
            return remark;
        }
    }

    public enum CodeSign {
        DELETE("0"),ADD("1");
        private String value;

        CodeSign(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
