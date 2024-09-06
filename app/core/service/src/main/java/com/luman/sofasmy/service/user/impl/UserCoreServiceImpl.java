package com.luman.sofasmy.service.user.impl;

import com.luman.sofa.common.dal.service.impl.CoreServiceImpl;
import com.luman.sofa.common.monitor.dal.DalLog;
import com.luman.sofasmy.dal.entity.UserDO;
import com.luman.sofasmy.dal.mapper.UserMapper;
import com.luman.sofasmy.model.user.User;
import com.luman.sofasmy.model.user.converter.UserExtInfo;
import com.luman.sofasmy.service.user.UserCoreService;
import org.springframework.stereotype.Service;

@Service
@DalLog
public class UserCoreServiceImpl extends CoreServiceImpl<User, UserDO, UserMapper> implements UserCoreService {

	@Override
	public UserDO convertToPO(User user) {
		UserDO userDO = buildDO(new UserDO(), user);
		userDO.setUsername(user.getUsername());
		UserExtInfo.buildExtInfo(userDO, user);
		return userDO;
	}

	@Override
	public User convertToDP(UserDO userDO) {
		User user = buildDP(new User(), userDO);
		user.setUsername(userDO.getUsername());
		UserExtInfo.buildExtObj(user, userDO);
		return user;
	}

}
