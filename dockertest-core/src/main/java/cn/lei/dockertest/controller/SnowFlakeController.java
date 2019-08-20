package cn.lei.dockertest.controller;

import cn.lei.dockertest.core.SnowflakeFactory;
import cn.lei.dockertest.vo.BaseVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leimin
 * @description
 * @time: 2019/08/20
 **/
@RestController
public class SnowFlakeController {

    @Resource
    private SnowflakeFactory snowflakeFactory;

    /**
     * 生成19位的id
     *
     * @return
     */
    @GetMapping("id")
    @ApiOperation(value = "生成一个ID", notes = "生成一个ID")
    public BaseVO<Long> generateId() {
        return new BaseVO<Long>("生成成功", generateIds(1).get(0));
    }

    @GetMapping("id/{count}")
    @ApiOperation(value = "生成多个ID", notes = "生成多个ID")
    public BaseVO<List<Long>> generateId(@PathVariable("count") Integer count) {
        return new BaseVO<>("生成成功", generateIds(count));
    }

    private List<Long> generateIds(Integer count) {
        List<Long> ids = new ArrayList();
        count = count == null ? 1 : count;
        for (int i = 0; i < count; i++) {
            long id = snowflakeFactory.nextId();
            ids.add(id);
        }
        return ids;
    }
}
