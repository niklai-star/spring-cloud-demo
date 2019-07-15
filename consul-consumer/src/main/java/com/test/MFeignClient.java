package com.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer", fallback = MFeignClientFallback.class, configuration = MFeignConfig.class)
public interface MFeignClient {

    @GetMapping("/hello")
    String hello();
}
