package com.bootdo.xcx.api.support;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/5/27 16:55
 * @Desc: as follows.
 */
@ConfigurationProperties(prefix = "weixin.xcx")
@Configuration
public class WeixinConfig {

    private String appId;
    private String appSecret;
    /**
     * https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=s%&js_code=%s&grant_type=authorization_code
     */
    private String sessionUrl;
    private String grantType = "authorization_code";

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getSessionUrl() {
        return sessionUrl;
    }

    public void setSessionUrl(String sessionUrl) {
        this.sessionUrl = sessionUrl;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}
