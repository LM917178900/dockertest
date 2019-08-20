package cn.lei.dockertest.service;

import cn.lei.dockertest.model.User;

/**
 * @author leimin
 * @DESCRIPTION
 * @time 2019/08/20
 **/
public interface IDockerService {
    User getById(Long id);
}
