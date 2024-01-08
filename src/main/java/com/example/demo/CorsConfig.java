package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 서버에서 Access-Control-Allow-Origin 헤더 세팅
// cord Error에 대한 허용정책
@Configuration // 주요 어노테이션.
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        corsRegistry.addMapping("/**") // 슬래시로 들어오는 모든 패턴에 대해 허용(URL 모두 허용)
                .allowedOrigins("*") // 모든 origin(출발지) 허용
                .allowedMethods("*"); // 어떤 메서드든 다 허용하겠다.
    }
}
