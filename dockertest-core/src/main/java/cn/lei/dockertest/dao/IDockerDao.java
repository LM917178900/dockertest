package cn.lei.dockertest.dao;

import cn.lei.dockertest.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author leimin
 * @DESCRIPTION
 * @time 2019/08/20
 **/
@Repository
public interface IDockerDao {
    @Results(id = "userMap",
            value = {
                    @Result(column = "user_id", property = "userId"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "sex", property = "sex"),
                    @Result(column = "avatar", property = "avatar"),
                    @Result(column = "create_time", property = "createTime"),
                    @Result(column = "update_time", property = "updateTime")
                    }
    )
    @Select("select * from user where user_id = #{id} order by create_time desc ")
    User getById(@Param("id") Long id);
}
