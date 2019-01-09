package com.spring.cloud.domain;

import java.io.Serializable;

/**
 * 用户模型
 *
 * @author shaoyifan@live.com
 * @since 1.0.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = -5688097732613347904L;

    /**
     * ID
     */
    private Long id;

    /**
     * 用户名称
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
