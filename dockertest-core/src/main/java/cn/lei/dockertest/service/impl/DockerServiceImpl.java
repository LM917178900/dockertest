package cn.lei.dockertest.service.impl;

import cn.lei.dockertest.dao.IDockerDao;
import cn.lei.dockertest.model.User;
import cn.lei.dockertest.service.IDockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leimin
 * @description
 * @time: 2019/08/20
 **/
@Service
public class DockerServiceImpl implements IDockerService {
    @Autowired
    private IDockerDao dockerDao;
    @Override
    public User getById(Long id) {
        return dockerDao.getById(id);
    }
}
