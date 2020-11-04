package com.waiwaiwai.springcloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Administrator
 * @DateTime: 2020/11/4 11:37
 * @Description:
 */
/**
    * 机构属性 
    */
@ApiModel(value="com-waiwaiwai-springcloud-entity-AuthOrgProperty")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "auth_org_property")
public class AuthOrgProperty implements Serializable {
    /**
     * 属性ID
     */
    @TableId(value = "ID", type = IdType.INPUT)
    @ApiModelProperty(value="属性ID")
    private String id;

    /**
     * 机构ID
     */
    @TableField(value = "ORG_ID")
    @ApiModelProperty(value="机构ID")
    private String orgId;

    /**
     * 属性名称
     */
    @TableField(value = "`NAME`")
    @ApiModelProperty(value="属性名称")
    private String name;

    /**
     * 属性值
     */
    @TableField(value = "`VALUE`")
    @ApiModelProperty(value="属性值")
    private String value;

    /**
     * 乐观锁
     */
    @TableField(value = "REVISION")
    @ApiModelProperty(value="乐观锁")
    private Integer revision;

    /**
     * 创建人
     */
    @TableField(value = "CREATED_BY")
    @ApiModelProperty(value="创建人")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField(value = "CREATED_TIME")
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createdTime;

    /**
     * 更新人
     */
    @TableField(value = "UPDATED_BY")
    @ApiModelProperty(value="更新人")
    private String updatedBy;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATED_TIME")
    @ApiModelProperty(value="更新时间")
    private LocalDateTime updatedTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_ORG_ID = "ORG_ID";

    public static final String COL_NAME = "NAME";

    public static final String COL_VALUE = "VALUE";

    public static final String COL_REVISION = "REVISION";

    public static final String COL_CREATED_BY = "CREATED_BY";

    public static final String COL_CREATED_TIME = "CREATED_TIME";

    public static final String COL_UPDATED_BY = "UPDATED_BY";

    public static final String COL_UPDATED_TIME = "UPDATED_TIME";
}