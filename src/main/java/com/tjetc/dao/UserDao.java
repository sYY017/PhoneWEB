package com.tjetc.dao;

import com.tjetc.domain.User;

import java.util.List;

public interface UserDao {
    //添加用户
    int addUser(User user);

    //根据Id删除用户信息
    int delUserById(int userId);

    //根据用户名修改密码
    int updatePwdByName(String password, String userName);

    //根据Id修改用户状态
    int updateStatusById(int status, int userId);

    //查询全部用户
    List<User> getAllUser();

    //根据用户名、密码获取用户信息
    User getUserByNameAndPwd(String userName, String password);

    //根据用户名查询用户
    User getUserByName(String userName);
}
