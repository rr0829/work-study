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
@TableName("student_record")
@Schema(name = "StudentRecord", description = "")
public class StudentRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "record_id", type = IdType.AUTO)
    private Integer recordId;

    @TableField("student_id")
    private Integer studentId;

    @TableField("type")
    private String type;

    @Schema(description = "记录标题")
    @TableField("title")
    private String title;

    @Schema(description = "颁发日期")
    @TableField("issue_date")
    private LocalDate issueDate;

    @Schema(description = "颁发单位")
    @TableField("issuer")
    private String issuer;

    @Schema(description = "详细说明")
    @TableField("description")
    private String description;

    @Schema(description = "附件路径")
    @TableField("attachment")
    private String attachment;

    @TableField("create_time")
    private LocalDateTime createTime;
}
