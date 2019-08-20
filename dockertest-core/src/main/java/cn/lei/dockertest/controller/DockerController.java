package cn.lei.dockertest.controller;

import cn.lei.dockertest.model.User;
import cn.lei.dockertest.service.IDockerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leimin
 * @description
 * @time: 2019/08/20
 **/
@RestController
public class DockerController {
    /**
     * mybatis查询mysql数据库
     */
    @Autowired
    private IDockerService dockerService;
    @GetMapping("user/id")
    @ApiOperation(value = "getById", notes = "getById")
    public User getById(Long id){
        return dockerService.getById(id);
    }
}
