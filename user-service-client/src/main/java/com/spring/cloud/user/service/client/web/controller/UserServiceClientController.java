package com.spring.cloud.user.service.client.web.controller;

import com.spring.cloud.api.UserService;
import com.spring.cloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@link UserService} 客户端 {@link RestController}
 * <p>
 * 注意：官方建议 客户端和服务端不要同时实现 Feign 接口
 * 这里的代码只是一个说明，实际情况最好使用组合的方式，而不是继承
 *
 * @author shaoyifan@live.com
 * @since 1.0.0
 */
@RestController
public class UserServiceClientController implements UserService {

    @Autowired
    private UserService userService;


    // 通过方法继承，URL 映射 ："/user/save"
    @Override
    public boolean saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // 通过方法继承，URL 映射 ："/user/find/all"
    @Override
    public List<User> findAll() {
        return userService.findAll();
    }

}
