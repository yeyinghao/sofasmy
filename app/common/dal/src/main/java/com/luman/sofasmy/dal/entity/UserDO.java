package com.luman.sofasmy.dal.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.luman.sofa.common.dal.model.DO;
import lombok.Data;

@TableName("org_user")
@Data
public class UserDO extends DO {

	private String username;

}
