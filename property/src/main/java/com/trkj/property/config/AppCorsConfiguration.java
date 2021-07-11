package com.trkj.property.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/***
 * @author 胡志远
 * @date 2021-07-11
 */
@Configuration
public class AppCorsConfiguration {
    private CorsConfiguration buildConfig() {
        CorsConfiguration appCorsConfiguration = new CorsConfiguration();
        // 1允许任何域名使用
        appCorsConfiguration.addAllowedOrigin("*");
        // 2允许任何头
        appCorsConfiguration.addAllowedHeader("*");
        // 3允许任何方法（post、get等）
        appCorsConfiguration.addAllowedMethod("{GET,HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH}");
        appCorsConfiguration.addAllowedMethod("OPTIONS");
        appCorsConfiguration.addAllowedMethod("HEAD");
        appCorsConfiguration.addAllowedMethod("GET");
        appCorsConfiguration.addAllowedMethod("PUT");
        appCorsConfiguration.addAllowedMethod("POST");
        appCorsConfiguration.addAllowedMethod("DELETE");
        appCorsConfiguration.addAllowedMethod("PATCH");
        //这两句不加不能跨域上传文件
        appCorsConfiguration.setAllowCredentials(true);
        //加上去就可
        appCorsConfiguration.setMaxAge(3600L);
        return appCorsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}