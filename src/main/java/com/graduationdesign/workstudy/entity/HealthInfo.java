package com.graduationdesign.workstudy.entity;

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
@TableName("health_info")
@Schema(name = "HealthInfo", description = "")
public class HealthInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("stu_id")
    private Integer stuId;

    @Schema(description = "血型")
    @TableField("blood_type")
    private String bloodType;

    @Schema(description = "过敏史")
    @TableField("allergy_history")
    private String allergyHistory;

    @Schema(description = "既往病史")
    @TableField("medical_history")
    private String medicalHistory;

    @Schema(description = "残疾情况")
    @TableField("disability_status")
    private String disabilityStatus;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
