package com.luman.sofasmy.bootstrap;

import com.luman.sofa.common.utils.LoggerUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 应用程序
 *
 * @author yeyinghao
 * @date 2024/08/25
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.luman"})
public class Application {

	/**
	 * 程序入口
	 *
	 * @param args arg游戏
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			LoggerUtil.error(log, e);
		}
	}

}
