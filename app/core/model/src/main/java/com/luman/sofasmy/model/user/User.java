package com.luman.sofasmy.model.user;

import com.luman.sofa.common.dal.model.DP;
import com.luman.sofasmy.dto.user.enums.SexEnum;
import lombok.Data;

@Data
public class User extends DP {

	private String username;

	private SexEnum sex;
}
