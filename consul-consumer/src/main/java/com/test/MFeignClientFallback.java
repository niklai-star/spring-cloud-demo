package com.test;

import org.springframework.stereotype.Component;

@Component
public class MFeignClientFallback implements MFeignClient {
    @Override
    public String hello() {
        return "fallback";
    }
}
