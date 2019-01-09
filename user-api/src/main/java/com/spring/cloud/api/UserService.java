package com.spring.cloud.api;

import com.spring.cloud.domain.User;
import com.spring.cloud.fallback.UserServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 用户服务
 *
 * @author shaoyifan@live.com
 * @since 1.0.0
 */
@FeignClient(name = "${user.service.name}",fallback = UserServiceFallback.class) // 利用占位符避免未来整合硬编码
public interface UserService {

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    @PostMapping("/user/save")
    boolean saveUser(User user);


    /**
     * 查询所有的用户列表
     *
     * @return non-null
     */
    @GetMapping("/user/find/all")
    List<User> findAll();

}
