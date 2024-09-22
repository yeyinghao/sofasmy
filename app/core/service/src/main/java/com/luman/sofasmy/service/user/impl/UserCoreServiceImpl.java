package com.luman.sofasmy.service.user.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.luman.sofa.common.dal.convert.ModelConverter;
import com.luman.sofa.common.dal.service.impl.CoreServiceImpl;
import com.luman.sofa.common.dto.PageModel;
import com.luman.sofa.common.monitor.dal.DalLog;
import com.luman.sofasmy.dal.entity.UserDO;
import com.luman.sofasmy.dal.mapper.UserMapper;
import com.luman.sofasmy.dto.user.UserPageQueryCmd;
import com.luman.sofasmy.model.user.User;
import com.luman.sofasmy.model.user.converter.UserExtInfo;
import com.luman.sofasmy.service.user.UserCoreService;
import org.springframework.stereotype.Service;

@Service
@DalLog
public class UserCoreServiceImpl extends CoreServiceImpl<User, UserDO, UserMapper> implements UserCoreService {

	@Override
	public UserDO convertToPO(User user) {
		UserDO userDO = ModelConverter.buildDP(UserDO.class, user);
		userDO.setUsername(user.getUsername());
		UserExtInfo.buildExtInfo(userDO, user);
		return userDO;
	}

	@Override
	public User convertToDP(UserDO userDO) {
		User user = ModelConverter.buildDP(User.class, userDO);
		user.setUsername(userDO.getUsername());
		UserExtInfo.buildExtObj(user, userDO);
		return user;
	}

	@Override
	public IPage<User> listByPage(IPage<UserDO> paging, UserPageQueryCmd userPageQueryCmd) {
		return lambdaQuery().page(paging).convert(this::convertToDP);
	}
}
