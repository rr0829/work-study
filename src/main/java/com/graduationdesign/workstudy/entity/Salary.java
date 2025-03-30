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
@TableName("salary")
@Schema(name = "Salary", description = "")
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("student_id")
    private Integer studentId;

    @TableField("position_id")
    private Integer positionId;

    @Schema(description = "结算月份 yyyy-MM")
    @TableField("month")
    private String month;

    @TableField("total_hours")
    private BigDecimal totalHours;

    @TableField("total_salary")
    private BigDecimal totalSalary;

    @TableField("payment_status")
    private String paymentStatus;

    @TableField("payment_time")
    private LocalDateTime paymentTime;
}
