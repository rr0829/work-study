package com.graduationdesign.workstudy.entity.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EnumUsers {
    public enum Role {
        STUDENT("STUDENT","学生"),
        TEACHER("TEACHER","老师"),
        ADMIN("ADMIN","管理员");

        @EnumValue
        private String value;

        @JsonValue
        private String desc;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        Role(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public static Role getRoleEnum(String value) {
            for (Role role : Role.values()) {
                if (role.getValue().equals(value)) {
                    return role;
                }
            }
            return null;
        }
    }

    public enum Status {
        NORMAL("NORMAL","正常"),
        FREEZE("FREEZE","冻结");

        @EnumValue
        private String value;

        @JsonValue
        private String desc;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        Status(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }
        public static Status getStatusEnum(String value) {
            for (Status status : Status.values()) {
                if (status.getValue().equals(value)) {
                    return status;
                }
            }
            return null;
        }
    }


}
