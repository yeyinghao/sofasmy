package com.luman.sofasmy.web;

import com.luman.sofa.common.dto.Response;
import com.luman.sofa.common.helper.RHelper;
import com.luman.sofa.common.monitor.rest.RestLog;
import com.luman.sofasmy.dto.user.data.UserVO;
import com.luman.sofasmy.shared.user.UserManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RestLog
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

	private final UserManager userManager;

	/**
	 * 获取byid
	 *
	 * @param id id
	 * @return {@link Response }<{@link UserVO }>
	 */
	@GetMapping("/{id}")
	public Response<UserVO> getById(@PathVariable("id") Long id) {
		return RHelper.success(userManager.getById(id));
	}

}
