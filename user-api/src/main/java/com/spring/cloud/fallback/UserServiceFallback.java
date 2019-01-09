package com.spring.cloud.fallback;

import com.spring.cloud.api.UserService;
import com.spring.cloud.domain.User;

import java.util.Collections;
import java.util.List;

/**
 * {@link UserService} Fallback 实现
 *
 * @author shaoyifan@live.com
 * @since 1.0.0
 */
public class UserServiceFallback implements UserService {

    @Override
    public boolean saveUser(User user) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return Collections.emptyList();
    }
}
