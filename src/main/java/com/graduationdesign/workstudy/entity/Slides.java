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
@TableName("slides")
@Schema(name = "Slides", description = "")
public class Slides implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "轮播图ID")
    @TableId(value = "slides_id", type = IdType.AUTO)
    private Integer slidesId;

    @Schema(description = "标题")
    @TableField("title")
    private String title;

    @Schema(description = "内容")
    @TableField("content")
    private String content;

    @Schema(description = "跳转链接")
    @TableField("url")
    private String url;

    @Schema(description = "轮播图路径")
    @TableField("img")
    private String img;

    @Schema(description = "点击量")
    @TableField("hits")
    private Integer hits;

    @Schema(description = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;
}
