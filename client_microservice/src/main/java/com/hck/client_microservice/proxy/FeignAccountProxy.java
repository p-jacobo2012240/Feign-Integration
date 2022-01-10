package com.hck.client_microservice.proxy;

import com.hck.client_microservice.proxy.external.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "${proxy.name}",  url = "${proxy.url}")
public interface FeignAccountProxy {

    @RequestMapping(path = "/account")
    List<Account> allAccount();

}
