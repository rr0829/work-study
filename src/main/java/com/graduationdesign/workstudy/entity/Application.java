package com.graduationdesign.workstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("application")
@Schema(name = "Application", description = "")
public class Application implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("student_id")
    private Integer studentId;

    @TableField("position_id")
    private Integer positionId;

    @TableField("apply_time")
    private LocalDateTime applyTime;

    @TableField("status")
    private String status;

    @Schema(description = "期望工作时间")
    @TableField("expected_work_time")
    private String expectedWorkTime;

    @Schema(description = "审核反馈")
    @TableField("feedback")
    private String feedback;

    @Schema(description = "处理人")
    @TableField("processor_id")
    private Integer processorId;

    @TableField("process_time")
    private LocalDateTime processTime;
}
