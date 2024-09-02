package com.luman.sofasmy.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 应用程序
 *
 * @author yeyinghao
 * @date 2024/08/25
 */
//@Slf4j
//@RestController
@SpringBootApplication(scanBasePackages = {"com.luman"})
//@RequiredArgsConstructor
public class Application {

//	/**
//	 * 应用程序配置
//	 */
//	private final AppConfig appConfig;

	/**
	 * 程序入口
	 *
	 * @param args arg游戏
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
//			LoggerUtil.error(log, e);
		}
	}

//	/**
//	 * 访问首页提示
//	 *
//	 * @return {@link String }
//	 */
//	@GetMapping("/")
//	public String index() {
//		return StrUtil.format("{} service started successfully.", appConfig.getApplicationName());
//	}

}
