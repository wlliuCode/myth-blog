package com.myth.sms.controller;

import com.aliyuncs.exceptions.ClientException;
import com.myth.common.core.result.Result;
import com.myth.common.core.result.ResultCode;
import com.myth.common.util.FormUtils;
import com.myth.common.util.RandomUtils;
import com.myth.sms.service.SmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@Api(tags = "短信发送接口")
@RestController
@RequestMapping("short-message")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @Autowired
    RedisTemplate redisTemplate;

    @ApiOperation(value = "发送短信", httpMethod = "POST")
    @PostMapping("send/{mobile}")
    public Result getLoginCode(@PathVariable("mobile") String mobile) throws ClientException {

        if (StringUtils.isEmpty(mobile) || !FormUtils.isMobile(mobile)){
            return Result.custom(ResultCode.MOBILE_VERIFICATION_ERROR);
        }

        String sixBitCode = RandomUtils.getSixBitRandom();

        //smsService.send(mobile,sixBitCode);

        redisTemplate.opsForValue().set(mobile,sixBitCode,5, TimeUnit.MINUTES);

        return Result.success();
    }
}
