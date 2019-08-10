package com.mht.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description: oss配置常量类
 * @author: 张逸峰
 * @create: 2019-08-03 09:24
 **/
@Component
@PropertySource(value = {"classpath:oss.properties"})
public class OSSConfig implements InitializingBean {

    @Value("${oss.file.endpoint}")
    private String oss_file_endpoint;

    @Value("${oss.file.keyid}")
    private String oss_file_keyid;

    @Value("${oss.file.keysecret}")
    private String oss_file_keysecret;

    @Value("${oss.file.filehost}")
    private String oss_file_filehost;

    @Value("${oss.file.bucketname}")
    private String oss_file_bucketname;


    public static String OSS_END_POINT;
    public static String OSS_ACCESS_KEY_ID;
    public static String OSS_ACCESS_KEY_SECRET;
    public static String OSS_BUCKET_NAME;
    public static String OSS_FILE_HOST;


    @Override
    public void afterPropertiesSet() throws Exception {
        OSS_ACCESS_KEY_ID = this.oss_file_keyid;
        OSS_END_POINT = this.oss_file_endpoint;
        OSS_ACCESS_KEY_SECRET = this.oss_file_keysecret;
        OSS_BUCKET_NAME = this.oss_file_bucketname;
        OSS_FILE_HOST = this.oss_file_filehost;
    }
}
