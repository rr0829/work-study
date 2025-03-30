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
@TableName("position")
@Schema(name = "Position", description = "")
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("title")
    private String title;

    @TableField("department_id")
    private Integer departmentId;

    @TableField("work_content")
    private String workContent;

    @Schema(description = "工作时间要求")
    @TableField("work_time")
    private String workTime;

    @TableField("salary_per_hour")
    private BigDecimal salaryPerHour;

    @Schema(description = "需要人数")
    @TableField("required_num")
    private Integer requiredNum;

    @Schema(description = "已录用人数")
    @TableField("current_num")
    private Integer currentNum;

    @TableField("status")
    private String status;

    @TableField("apply_deadline")
    private LocalDateTime applyDeadline;

    @TableField("create_time")
    private LocalDateTime createTime;
}
