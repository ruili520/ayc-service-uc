package com.ayc.service.uc.common.enums;

public class AycUserEnums {

    /**
     * 文章本身状态
     */
    public enum Types{
        AUTHOR((byte) 1, "作者"),
        USER((byte) 2, "普通用户");

        private Byte code;
        private String description;

        Types(Byte code, String description){
            this.code = code;
            this.description = description;
        }

        public Byte getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }
    }

}
