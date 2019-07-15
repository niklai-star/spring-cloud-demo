package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @RefreshScope 可以用POST请求 ip:port/refresh 即可重新加载配置文件而无需重启
 * @EnableZuulProxy 代理调用方式：ip:port/服务名/地址
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@RefreshScope
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
