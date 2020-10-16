package com.myth.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myth.ums.api.dto.UserDto;
import com.myth.ums.mapper.UserDtoMapper;
import com.myth.ums.service.UserDtoService;
import org.springframework.stereotype.Service;

@Service
public class UserDtoServiceImpl extends ServiceImpl<UserDtoMapper, UserDto> implements UserDtoService {
}
