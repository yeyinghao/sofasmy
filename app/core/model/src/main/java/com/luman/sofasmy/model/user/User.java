package com.luman.sofasmy.model.user;

import com.luman.sofa.common.dal.model.DP;
import com.luman.sofasmy.dto.user.enums.SexEnum;
import lombok.Data;

import java.util.List;

@Data
public class User extends DP {

	private String username;

	private SexEnum sex;

	private List<SexEnum> sexList;
}
