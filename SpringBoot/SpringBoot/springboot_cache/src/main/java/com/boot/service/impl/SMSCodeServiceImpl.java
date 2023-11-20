package com.boot.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.boot.Utils.CodeUtils;
import com.boot.bean.SMSCode;
import com.boot.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author bin
 * @date 2023-02-23-15:53
 */
@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;

    // 默认存储方案
    /*@Override
    @CachePut(value = "smsCode", key = "#phone")
    public String sendCode(String phone) {
        String code = codeUtils.generator(phone);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = codeUtils.getCode(smsCode.getPhone());
        return smsCode.getCode().equals(code);
    }*/


    // jetcache
    /**
     * area: 存储空间, 此时不要忘了在 application.yml 中配置
     * name: 名字
     * expire: 过期时间, 默认秒
     * timeUnit: 过期时间单位
     * cacheType: 缓存类型, 默认使用远程缓存
     */
    @CreateCache(name = "jetcache_", expire = 100, timeUnit = TimeUnit.SECONDS, cacheType = CacheType.REMOTE)
    private Cache<String, String> jetCache;

    @Override
    public String sendCode(String phone) {
        String code = codeUtils.generator(phone);
        jetCache.put(phone, code);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = jetCache.get(smsCode.getPhone());
        return smsCode.getCode().equals(code);
    }
}
