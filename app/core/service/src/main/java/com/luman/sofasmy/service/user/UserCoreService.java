package com.luman.sofasmy.service.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.luman.sofa.common.dal.service.CoreService;
import com.luman.sofasmy.dal.entity.UserDO;
import com.luman.sofasmy.dto.user.UserPageQueryCmd;
import com.luman.sofasmy.model.user.User;

public interface UserCoreService extends CoreService<User, UserDO> {

	IPage<User> listByPage(IPage<UserDO> paging, UserPageQueryCmd userPageQueryCmd);
}
