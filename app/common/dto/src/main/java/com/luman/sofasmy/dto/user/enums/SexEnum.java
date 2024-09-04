package com.luman.sofasmy.dto.user.enums;

import com.luman.sofa.common.enums.ByStringCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum SexEnum implements ByStringCode {

	/**
	 * 男
	 */
	MALE("MALE", "男"),

	/**
	 * 女
	 */
	FEMALE("FEMALE", "女"),

	;

	private final String code;

	private final String desc;

}
