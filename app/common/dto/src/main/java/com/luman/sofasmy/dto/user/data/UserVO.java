package com.luman.sofasmy.dto.user.data;

import com.luman.sofa.dto.EnumVO;
import com.luman.sofa.dto.VO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserVO extends VO {

	private Long id;

	private String username;

	private EnumVO sex;

	private List<EnumVO> sexList;

}
