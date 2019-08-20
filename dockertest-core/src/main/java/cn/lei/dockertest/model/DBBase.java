package cn.lei.dockertest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: create by songhongzhe
 * @version: v1.0
 * @description: cn.cncommdata.metadata.model
 * @date:2019-03-27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DBBase {
    /**
     * id
     */
    private Long id;
    /**
     * 租户ID
     */
    private Long tenantId;
    /**
     * 删除标记
     */
    private Boolean deleted;
    /**
     * 创建者GrantId
     */
    private Long creator;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新者GrantId
     */
    private Long editor;
    /**
     * 更新时间
     */
    private Date editTime;

}