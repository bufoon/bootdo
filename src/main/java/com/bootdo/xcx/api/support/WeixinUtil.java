package com.bootdo.xcx.api.support;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/6/3 16:07
 * @Desc: as follows.
 */
public class WeixinUtil {
    private static final String WATERMARK = "watermark";
    private static final String APPID = "appid";
    /**
     * 解密数据
     * @return
     * @throws Exception
     */
    public static String decrypt(String appId, String encryptedData, String sessionKey, String iv){
        String result = "";
        try {
            AES aes = new AES();
            byte[] resultByte = aes.decrypt(Base64.decodeBase64(encryptedData), Base64.decodeBase64(sessionKey), Base64.decodeBase64(iv));
            if(null != resultByte && resultByte.length > 0){
                result = new String(WxPKCS7Encoder.decode(resultByte));
                System.out.println(result);
                JSONObject jsonObject = JSON.parseObject(result);
                String decryptAppid = jsonObject.getJSONObject(WATERMARK).getString(APPID);
                if(!appId.equals(decryptAppid)){
                    result = "";
                }
            }
        } catch (Exception e) {
            result = "";
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws Exception{
        String appId = "wx3ed73dd47f9485ad";
        String encryptedData = "GLakvUHVcv+r/xkPsLo9iVcPIVJpEe+mIxnfRRU/xxuebOU7hpJvqBbsKRxZwJY92z8WGQSM4Ip4WmFLalbS8f/ZRmfOeCflxwMJSi4yHilRacWTn9W7Z2ZMRP0Ksh2Sag4KX5IDuAJsKiE+mlz7adblvysKV4aYL6GnbcaYLkLuWF4wXDz59MemP1G74MT8M0e9/tCny7+uwOWB2qfKWwy4I8xosdlcWaOH49PSS9JM6s/4dKXmWJ4xPTCr/pjmMWad/X4Gf3wshH2vFajxUexn+LIwKBqDe4KoypTjPuRDfBMyps8jElPSB+d9KA6deMvMW6ei8TBkNB8McdYgnGGgpDFZ5zdISy+UzXkCIrfkzLIdQTytVxfeYlMpZBqYx0xpMVtrKBsFtH3Eu4lkvLr42/6FOR9ZXzgDgiHqBSTc8bJP+szYaZpcA/o8GSRcLzRRAeoPKVO2CZ/uUyUCZPoV2BiUZSfNvB56r90EZrc=";
        String sessionKey = "IcSJFjxFHTAFp6drLWyfiQ==";
        String iv = "4ze5CJVcCfogmXIx0D06dQ==";
        System.out.println("===========================");
        System.out.println(decrypt(appId, encryptedData, sessionKey, iv));
    }
}
