package com.graduationdesign.workstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
@TableName("student")
@Schema(name = "Student", description = "")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "学号")
    @TableField("student_no")
    private String studentNo;

    @Schema(description = "关联用户ID")
    @TableField("user_id")
    private Integer userId;

    @Schema(description = "姓名")
    @TableField("name")
    private String name;

    @Schema(description = "性别")
    @TableField("gender")
    private String gender;

    @Schema(description = "出生日期")
    @TableField("birth_date")
    private LocalDate birthDate;

    @Schema(description = "身份证号")
    @TableField("id_card")
    private String idCard;

    @Schema(description = "民族")
    @TableField("nation")
    private String nation;

    @Schema(description = "政治面貌")
    @TableField("political_status")
    private String politicalStatus;

    @Schema(description = "籍贯（省+市）")
    @TableField("native_place")
    private String nativePlace;

    @Schema(description = "学院")
    @TableField("college")
    private String college;

    @Schema(description = "专业")
    @TableField("major")
    private String major;

    @Schema(description = "班级")
    @TableField("stu_class")
    private String stuClass;

    @Schema(description = "入学日期")
    @TableField("enrollment_date")
    private LocalDate enrollmentDate;

    @Schema(description = "学制（年）")
    @TableField("school_system")
    private Byte schoolSystem;

    @Schema(description = "预计毕业时间")
    @TableField("expected_graduation")
    private LocalDate expectedGraduation;

    @Schema(description = "在校状态")
    @TableField("status")
    private String status;

    @Schema(description = "家庭地址")
    @TableField("home_address")
    private String homeAddress;

    @Schema(description = "邮政编码")
    @TableField("postcode")
    private String postcode;

    @Schema(description = "银行账户")
    @TableField("bank_account")
    private String bankAccount;

    @Schema(description = "联系电话")
    @TableField("phone")
    private String phone;

    @Schema(description = "紧急联系人")
    @TableField("emergency_contact")
    private String emergencyContact;

    @Schema(description = "证件照路径")
    @TableField("photo")
    private String photo;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;
}
