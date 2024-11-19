package com.luman.sofasmy.shared.user.cmd.query;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.luman.sofa.common.dal.convert.PageConverter;
import com.luman.sofa.common.utils.EnumUtil;
import com.luman.sofa.dto.PageModel;
import com.luman.sofasmy.dal.entity.UserDO;
import com.luman.sofasmy.dto.user.UserPageQueryCmd;
import com.luman.sofasmy.dto.user.data.UserVO;
import com.luman.sofasmy.model.user.User;
import com.luman.sofasmy.service.user.UserCoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserQueryCmdExe implements PageConverter {

	private final UserCoreService userCoreService;

	public UserVO getById(Long id) {
		return userCoreService.findById(id).map(this::buildUserVO).orElse(null);
	}

	private UserVO buildUserVO(User user) {
		UserVO userVO = new UserVO();
		userVO.setId(user.getId());
		userVO.setUsername(user.getUsername());
		userVO.setSex(EnumUtil.enum2VO(user.getSex()));
		if (CollUtil.isNotEmpty(user.getSexList())) {
			userVO.setSexList(user.getSexList().stream().map(EnumUtil::enum2VO).toList());
		}
		return userVO;
	}

	public PageModel<UserVO> pageUser(UserPageQueryCmd userPageQueryCmd) {
		IPage<UserDO> doiPage = paging2Page(userPageQueryCmd.getPaging());
		IPage<User> userIPage = userCoreService.listByPage(doiPage);
		return page2PageModel(userIPage).convert(this::buildUserVO);
	}
}
