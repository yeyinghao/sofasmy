package com.luman.sofasmy.shared.user.cmd;

import com.luman.sofa.common.utils.EnumUtil;
import com.luman.sofasmy.dto.user.UserSaveCmd;
import com.luman.sofasmy.dto.user.enums.SexEnum;
import com.luman.sofasmy.model.user.User;
import com.luman.sofasmy.service.user.UserCoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCmdExe {

	private final UserCoreService userCoreService;

	public Long saveUser(UserSaveCmd userSaveCmd) {
		User user = buildUser(userSaveCmd);
		return userCoreService.save(user);
	}

	private static User buildUser(UserSaveCmd userSaveCmd) {
		User user = new User();
		user.setUsername(userSaveCmd.getUsername());
		user.setPassword(userSaveCmd.getPassword());
		user.setName(userSaveCmd.getName());
		user.setSex(EnumUtil.getEnumByCode(SexEnum.class, userSaveCmd.getSex()).orElse(null));
		user.setSexList(userSaveCmd.getSexList().stream().map(item -> EnumUtil.
				getEnumByCode(SexEnum.class, item).orElse(null)).toList());
		return user;
	}
}
