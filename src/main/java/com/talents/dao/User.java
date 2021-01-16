package com.talents.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("hq_user")
public class User {

    @TableId(type = IdType.AUTO)
    private int id;

    private String nickname;

    private String name;

    private long phone;
}
