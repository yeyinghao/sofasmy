package com.luman.sofasmy.dto.user;

import com.luman.sofa.common.dto.Command;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserSaveCmd extends Command {

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 姓名（较常用，故放在用户主表）
	 */
	private String name;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 性别列表
	 */
	private List<String> sexList;

}
