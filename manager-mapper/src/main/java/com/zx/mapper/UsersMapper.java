package com.zx.mapper;

import com.zx.pojo.Users;

import java.util.List;

/**
 * @Auther: zj
 * @Date: 2020/12/30
 * @Description: com.zx.mapper
 * @Version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
