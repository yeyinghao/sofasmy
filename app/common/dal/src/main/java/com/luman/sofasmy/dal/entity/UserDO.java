package com.luman.sofasmy.dal.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.luman.sofa.common.dal.model.DO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@TableName("org_user")
@Data
public class UserDO extends DO {

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

}
