package com.hackobo.client.management.infrastructure.proxies;

import com.hackobo.client.management.infrastructure.proxies.external.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "${proxy.name}",  url = "${proxy.url}")
public interface FeignAccountProxy {

    @RequestMapping(path = "/account/list")
    List<Account> allAccount();

}

