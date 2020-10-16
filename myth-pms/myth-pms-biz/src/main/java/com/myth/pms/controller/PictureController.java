package com.myth.pms.controller;

import com.myth.common.core.result.IResultCode;
import com.myth.common.core.result.Result;
import com.myth.common.core.result.ResultCode;
import com.myth.pms.service.PictureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = "图片管理接口")
@RestController
@RequestMapping("pictures")
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @ApiOperation(value = "上传图片", httpMethod = "POST")
    @PostMapping("upload")
    public Result uploadImage(@RequestBody MultipartFile file) throws Exception {
        String url = pictureService.uploadImage(file);
        if (StringUtils.isEmpty(url)) {
            return Result.custom(ResultCode.USER_UPLOAD_FILE_ERROR);
        }
        return Result.success(url);
    }


}
