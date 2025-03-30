package com.graduationdesign.workstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author lmt
 * @since 2025-03-30
 */
@Getter
@Setter
@TableName("student_info")
@Schema(name = "StudentInfo", description = "")
public class StudentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("user_id")
    private Integer userId;

    @Schema(description = "学号")
    @TableField("student_id")
    private String studentId;

    @Schema(description = "性别")
    @TableField("gender")
    private String gender;

    @TableField("email")
    private String email;

    @TableField("phone")
    private String phone;

    @Schema(description = "学院")
    @TableField("college")
    private String college;

    @Schema(description = "专业")
    @TableField("major")
    private String major;

    @Schema(description = "年级")
    @TableField("grade")
    private String grade;

    @Schema(description = "银行账户")
    @TableField("bank_account")
    private String bankAccount;
}
