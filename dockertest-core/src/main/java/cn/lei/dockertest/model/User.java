package cn.lei.dockertest.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author leimin
 * @description
 * @time: 2019/08/20
 **/
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long userId;
    private String name;
    private String sex;
    private String avatar;
    private Date createTime;
    private Date updateTime;

}
