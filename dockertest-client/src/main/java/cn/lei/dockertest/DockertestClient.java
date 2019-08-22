package cn.lei.dockertest;

import cn.lei.dockertest.feign.DockertestFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * DockertestClient
 */
@Component
public class DockertestClient {


    /**
     * DockertestFeignClient
     */
    @Autowired
    private DockertestFeignClient feignClient;
}
