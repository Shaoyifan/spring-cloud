package com.spring.cloud.user.service.provider.service;

import com.spring.cloud.api.UserService;
import com.spring.cloud.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 内存实现{@link UserService}
 *
 * @author shaoyifan@live.com
 * @since 0.0.1
 */
@Service("inMemoryUserService") // Bean 名称
public class InMemoryUserService implements UserService {

    private Map<Long, User> repository = new ConcurrentHashMap<>();

    @Override
    public boolean saveUser(User user) {
        return repository.put(user.getId(), user) == null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList(repository.values());
    }
}
