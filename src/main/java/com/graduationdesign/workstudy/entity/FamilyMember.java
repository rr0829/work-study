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
@TableName("family_member")
@Schema(name = "FamilyMember", description = "")
public class FamilyMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "member_id", type = IdType.AUTO)
    private Integer memberId;

    @TableField("student_id")
    private Integer studentId;

    @Schema(description = "姓名")
    @TableField("name")
    private String name;

    @TableField("relationship")
    private String relationship;

    @Schema(description = "职业")
    @TableField("occupation")
    private String occupation;

    @Schema(description = "工作单位")
    @TableField("work_unit")
    private String workUnit;

    @Schema(description = "联系电话")
    @TableField("phone")
    private String phone;

    @Schema(description = "是否监护人")
    @TableField("is_guardian")
    private Boolean isGuardian;
}
