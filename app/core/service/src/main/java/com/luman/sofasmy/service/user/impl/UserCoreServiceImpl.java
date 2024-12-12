package com.luman.sofasmy.service.user.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.luman.sofa.common.constant.LoggerConstant;
import com.luman.sofa.common.dal.service.impl.CoreServiceImpl;
import com.luman.sofa.common.log.Logged;
import com.luman.sofasmy.dal.entity.UserDO;
import com.luman.sofasmy.dal.mapper.UserMapper;
import com.luman.sofasmy.dto.user.UserPageQueryCmd;
import com.luman.sofasmy.model.user.User;
import com.luman.sofasmy.model.user.converter.UserExtInfo;
import com.luman.sofasmy.service.user.UserCoreService;
import org.springframework.stereotype.Service;

@Service
@Logged(topic = LoggerConstant.DAL_LOG)
public class UserCoreServiceImpl extends CoreServiceImpl<User, UserDO, UserMapper> implements UserCoreService {

	@Override
	public UserDO convert(User user) {
		return convert(user, UserDO::new, (s, t) -> {
			t.setUsername(s.getUsername());
			UserExtInfo.buildExtInfo(t, s);
		});
	}

	@Override
	public User convert(UserDO userDO) {
		return convert(userDO, User::new, (s, t) -> {
			t.setUsername(s.getUsername());
			UserExtInfo.buildExtInfo(t, s);
		});
	}

	@Override
	public IPage<User> listByPage(IPage<UserDO> paging, UserPageQueryCmd userPageQueryCmd) {
		return lambdaQuery().page(paging).convert(this::convert);
	}
}
