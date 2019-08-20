package cn.lei.dockertest.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leimin
 * @description
 * @time: 2019/08/20
 **/
@RestController
public class IntelligenceController {
    /**
     * 模拟人工智能
     *
     * @param received
     * @return
     */
    @GetMapping("replay")
    @ApiOperation(value = "人工智能", notes = "人工智能")
    public String replay(String received){

        StringBuilder answer = new StringBuilder();
        if(received.contains("吗")){
            answer.append(received.split("吗")[0]).append("！");
        }else{
            answer.append(received);
        }

        return answer.toString();
    }
}
