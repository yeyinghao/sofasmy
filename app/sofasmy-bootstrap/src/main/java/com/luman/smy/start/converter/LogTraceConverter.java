/*
 * Copyright (c) Ye Yinghao
 * 2022.1 - 2024.1
 */

package com.luman.smy.start.converter;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.luman.smy.util.TraceIdUtil;

/**
 * 日志跟踪转换器
 *
 * @author yeyinghao
 * @date 2024/08/19
 */
public class LogTraceConverter extends ClassicConverter {

	@Override
	public String convert(ILoggingEvent iLoggingEvent) {
		return TraceIdUtil.getThreadTraceId();
	}
}