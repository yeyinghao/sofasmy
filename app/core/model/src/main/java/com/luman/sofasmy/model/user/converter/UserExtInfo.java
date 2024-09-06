package com.luman.sofasmy.model.user.converter;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.luman.sofa.common.exception.BizExceptionFactory;
import com.luman.sofa.common.utils.EnumUtil;
import com.luman.sofasmy.dal.entity.UserDO;
import com.luman.sofasmy.dto.user.enums.SexEnum;
import com.luman.sofasmy.model.user.User;

import java.util.Objects;

public class UserExtInfo {

	private static final String SEX_KEY = "sex";

	private static final String SEXLIST_KEY = "sexList";

	public static void buildExtInfo(UserDO userDO, User user) {
		JSONObject extObj = new JSONObject();
		if (Objects.nonNull(user.getSex())) {
			extObj.putOpt(SEX_KEY, EnumUtil.getName(user.getSex()));
		}
		if (CollUtil.isNotEmpty(user.getSexList())) {
			extObj.putOpt(SEXLIST_KEY, EnumUtil.getNames(user.getSexList()));
		}
		if (MapUtil.isNotEmpty(extObj)) {
			userDO.setExtInfo(JSONUtil.toJsonStr(extObj));
		}
	}

	public static void buildExtObj(User user, UserDO userDO) {
		String extInfo = userDO.getExtInfo();
		if (StrUtil.isBlank(extInfo)) {
			return;
		}
		JSONObject extObj = JSONUtil.toBean(extInfo, JSONObject.class);
		String sexStr = extObj.getStr(SEX_KEY);
		if (StrUtil.isNotBlank(sexStr)) {
			user.setSex(EnumUtil.getEnumByCode(SexEnum.class, sexStr).orElseThrow(() -> BizExceptionFactory.build(sexStr)));
		}
		String sexListStr = extObj.getStr(SEXLIST_KEY);
		if (StrUtil.isNotBlank(sexListStr)) {
			user.setSexList(EnumUtil.getEnumsByCodes(SexEnum.class, JSONUtil.toList(sexStr, String.class)));
		}
	}
}
