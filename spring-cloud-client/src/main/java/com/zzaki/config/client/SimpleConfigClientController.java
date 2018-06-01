package com.zzaki.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zzaki
 * @Description:
 * @Date: Created on 2018/5/31
 * @Company: DeepWise
 */
@RestController
@RefreshScope
public class SimpleConfigClientController {

    @Value("${config.scaner.user}")
    private String scanerUser;

    @RequestMapping("/config-scaner-user")
    public String getScanerUser(){
        return scanerUser;
    }


}
