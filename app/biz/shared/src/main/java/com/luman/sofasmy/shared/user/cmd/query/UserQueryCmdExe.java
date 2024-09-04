package com.luman.sofasmy.shared.user.cmd.query;

import com.luman.sofasmy.dto.user.data.UserVO;
import com.luman.sofasmy.model.user.User;
import com.luman.sofasmy.service.user.UserCoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserQueryCmdExe {

	private final UserCoreService userCoreService;

	public UserVO getById(Long id) {
		return userCoreService.findById(id).map(this::buildUserVO).orElse(null);
	}

	private UserVO buildUserVO(User user) {
		UserVO userVO = new UserVO();
		userVO.setId(user.getId());
		userVO.setUsername(user.getUsername());
		return userVO;
	}
}
