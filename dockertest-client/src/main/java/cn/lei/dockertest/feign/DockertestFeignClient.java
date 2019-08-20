package cn.lei.dockertest.feign;

import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;


/**
 * DockertestClient
 */
@FeignClient(name = "dockertest", url = "${dockertest.service.url}")
public interface DockertestFeignClient {


}
