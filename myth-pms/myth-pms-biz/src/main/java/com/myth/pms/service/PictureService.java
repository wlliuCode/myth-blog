package com.myth.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myth.pms.api.entity.Picture;
import org.springframework.web.multipart.MultipartFile;

public interface PictureService extends IService<Picture> {
    String uploadImage(MultipartFile file) throws Exception;
}
