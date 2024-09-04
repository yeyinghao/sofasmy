package com.luman.sofasmy.shared.user.impl;

import com.luman.sofasmy.dto.user.data.UserVO;
import com.luman.sofasmy.shared.user.UserManager;
import com.luman.sofasmy.shared.user.cmd.UserCmdExe;
import com.luman.sofasmy.shared.user.cmd.query.UserQueryCmdExe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserManagerImpl implements UserManager {

	private final UserCmdExe userCmdExe;

	private final UserQueryCmdExe userQueryCmdExe;

	@Override
	public UserVO getById(Long id) {
		return userQueryCmdExe.getById(id);
	}
}
