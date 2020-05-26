package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhang_yg
 * @since 2020/3/24 13:58
 */
@RestController
public class CustomController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    public String getProduct(){
        System.out.println("开始调用product");
        return restTemplate.getForObject("http://product/product",String.class);
    }
}
