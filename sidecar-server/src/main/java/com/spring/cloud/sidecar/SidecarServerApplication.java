package com.spring.cloud.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * 启用sidecar
 *
 * @author shaoyifan@live.com
 * @since 0.0.1
 */
@SpringBootApplication
@EnableSidecar
public class SidecarServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidecarServerApplication.class, args);
    }

}