package com.luman.sofasmy.dto.user.data;

import com.luman.sofa.common.dto.EnumVO;
import com.luman.sofa.common.dto.VO;
import lombok.Data;

import java.util.List;

@Data
public class UserVO extends VO {

	private Long id;

	private String username;

	private EnumVO sex;

	private List<EnumVO> sexList;

}
