/*
 * Copyright (c) Ye Yinghao
 * 2022.1 - 2024.1
 */

package com.luman.sofasmy.bootstrap.config;

import com.luman.sofa.common.constant.CommConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 *
 * @author yeyinghao
 * @date 2023/08/01
 */
@Configuration
@RequiredArgsConstructor
public class WebConfig implements WebMvcConfigurer {

	/**
	 * 添加处理程序以提供来自 Web 应用程序根目录、类路径等特定位置的静态资源，例如图像、js 和 css 文件。
	 *
	 * @param registry registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/favicon.ico").addResourceLocations("classpath:/static/");
	}

	/**
	 * 跨域支持
	 *
	 * @param registry 注册表
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOriginPatterns("*").allowCredentials(true)
				.allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "OPTIONS", "HEAD")
				.maxAge(CommConstant.CORS_MAX_AGE_SECOND);
	}
}
