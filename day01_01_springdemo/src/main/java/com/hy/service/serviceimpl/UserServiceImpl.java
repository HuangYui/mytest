package com.hy.service.serviceimpl;

import com.hy.service.UserService;

/**
 * @author HY
 * @ClassName UserServiceImpl
 * @Description TODE
 * @DateTime 2020/12/24 17:24
 * Version 1.0
 */
public class UserServiceImpl implements UserService {
    public void init(){
        System.out.println("执行了初始方法");
    }
    @Override
    public void login(){
        System.out.println("登录...");
    }

    public void destroy(){
        System.out.println("对象销毁了");
    }
}
