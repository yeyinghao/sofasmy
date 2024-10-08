package com.luman.sofasmy.web;

import com.luman.sofa.common.dto.PageModel;
import com.luman.sofa.common.dto.Response;
import com.luman.sofa.common.monitor.rest.RestLog;
import com.luman.sofasmy.dto.user.UserPageQueryCmd;
import com.luman.sofasmy.dto.user.UserSaveCmd;
import com.luman.sofasmy.dto.user.data.UserVO;
import com.luman.sofasmy.shared.user.UserManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
		return Response.success(userManager.getById(id));
	}

	@PostMapping
	public Response<Long> saveUser(@RequestBody UserSaveCmd userSaveCmd) {
		return Response.success(userManager.saveUser(userSaveCmd));
	}

	@PostMapping("/page")
	public Response<PageModel<UserVO>> pageUser(@RequestBody UserPageQueryCmd userPageQueryCmd) {
		return Response.success(userManager.pageUser(userPageQueryCmd));
	}

}
