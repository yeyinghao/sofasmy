package com.luman.sofasmy.service.user;

import com.luman.sofa.common.dal.service.CoreService;
import com.luman.sofa.common.dto.PageModel;
import com.luman.sofasmy.dto.user.UserPageQueryCmd;
import com.luman.sofasmy.model.user.User;

public interface UserCoreService extends CoreService<User> {

	PageModel<User> listByPage(UserPageQueryCmd userPageQueryCmd);
}
