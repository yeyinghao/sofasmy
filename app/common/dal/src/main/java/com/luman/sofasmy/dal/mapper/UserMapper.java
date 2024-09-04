package com.luman.sofasmy.dal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luman.sofasmy.dal.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
