package com.xiaozhao.blog.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * OSS配置属性
 * @Author: XIAO ZHAO
 * @Date: 2022/5/16 22:55
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "upload.oss")
public class OssConfigProperties {

    /**
     * oss域名
     */
    private String url;

    /**
     * 终点
     */
    private String endpoint;

    /**
     * 访问密钥id
     */
    private String accessKeyId;

    /**
     * 访问密钥密码
     */
    private String accessKeySecret;

    /**
     * bucket名称
     */
    private String bucketName;

}
