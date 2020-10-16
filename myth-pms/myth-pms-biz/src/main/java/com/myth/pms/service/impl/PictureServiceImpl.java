package com.myth.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myth.common.minio.utils.MinioUtil;
import com.myth.pms.api.entity.Picture;
import com.myth.pms.mapper.PictureMapper;
import com.myth.pms.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture> implements PictureService {

    @Autowired
    private MinioUtil minioUtil;

    @Value("${minio.endpoint}")
    String endpoint;

    @Override
    public String uploadImage(MultipartFile file) throws Exception {
        System.out.println(file.getOriginalFilename());
        boolean isUpload = minioUtil.putObject("img", file.getOriginalFilename(),
                file.getInputStream(),file.getContentType());
        return endpoint+"img/"+file.getOriginalFilename();
    }
}
