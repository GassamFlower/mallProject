package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class SmsHomeRecommendSubject implements Serializable {
    private Long id;

    @ApiModelProperty("用户id")
    private Long adminId;

    private Long subjectId;

    private String subjectName;

    private Integer recommendStatus;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminId=").append(adminId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}