package com.luman.sofasmy.model.user;

import com.luman.sofa.common.dal.model.DP;
import com.luman.sofasmy.dto.user.enums.SexEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class User extends DP {

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




	private SexEnum sex;

	private List<SexEnum> sexList;
}
