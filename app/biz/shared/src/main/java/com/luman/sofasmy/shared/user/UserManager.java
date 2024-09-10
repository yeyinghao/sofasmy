package com.luman.sofasmy.shared.user;

import com.luman.sofa.common.dto.PageModel;
import com.luman.sofasmy.dto.user.UserPageQueryCmd;
import com.luman.sofasmy.dto.user.UserSaveCmd;
import com.luman.sofasmy.dto.user.data.UserVO;

public interface UserManager {

	UserVO getById(Long id);

	Long saveUser(UserSaveCmd userSaveCmd);

	PageModel<UserVO> pageUser(UserPageQueryCmd userPageQueryCmd);
}
