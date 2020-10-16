package com.myth.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myth.ums.api.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserDtoMapper extends BaseMapper<UserDto> {
}
