package com.frog.component.producer.controller;

import com.alibaba.nacos.api.config.annotation.NacosProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lh
 * @date 2021/10/28 15:43
 * @desc
 */
@Slf4j
@RestController
@RefreshScope
@RequestMapping("producer/service_info")
public class BasicController {

    @Value("${environment.name}")
    private String environmentName;

    @GetMapping("environment_name")
    public String getEnvironmentName(){
        return environmentName;
    }
}
