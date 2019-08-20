package cn.lei.dockertest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * DockertestClient
 */
@Component
public class DockertestFeignClient {


    /**
     * DockertestFeignClient
     */
    @Autowired
    private DockertestFeignClient feignClient;
}
