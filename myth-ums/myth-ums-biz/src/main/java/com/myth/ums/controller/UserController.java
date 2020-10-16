package com.myth.ums.controller;

import com.myth.common.core.result.Result;
import com.myth.ums.api.dto.UserDto;
import com.myth.ums.service.UserDtoService;
import com.myth.ums.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "用户管理接口")
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserDtoService userDtoService;

    @ApiOperation(value = "根据用户ID获取用户信息", httpMethod = "POST")
    @PostMapping("user/{id}")
    public Result getById(@PathVariable("id") String id){
        UserDto userDTO = userDtoService.getById(id);
        return Result.success(userDTO);
    }


}
