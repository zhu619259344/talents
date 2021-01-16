package com.talents.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.talents.dao.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT * from hq_user\n" +
            "limit #{start},#{pageSize}")
    List<User> page(@Param("start") int start, @Param("pageSize") int pageSize);
}