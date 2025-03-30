package com.graduationdesign.workstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("attendance")
@Schema(name = "Attendance", description = "")
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("student_id")
    private Integer studentId;

    @TableField("position_id")
    private Integer positionId;

    @Schema(description = "打卡时间")
    @TableField("check_in_time")
    private LocalDateTime checkInTime;

    @Schema(description = "实际工时")
    @TableField("work_hours")
    private BigDecimal workHours;

    @TableField("status")
    private String status;

    @Schema(description = "工作评价")
    @TableField("evaluation")
    private String evaluation;

    @Schema(description = "操作人")
    @TableField("operator_id")
    private Integer operatorId;
}
