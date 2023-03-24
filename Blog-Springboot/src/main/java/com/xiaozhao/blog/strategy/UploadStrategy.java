package com.xiaozhao.blog.strategy;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: XIAO ZHAO
 * @Date: 2022/5/17 1:25
 * 上传策略
 */

public interface UploadStrategy {

    /**
     * 上传文件
     *
     * @param file 文件
     * @param path 上传路径
     * @return {@link String} 文件地址
     */
    String uploadFile(MultipartFile file, String path);

}
