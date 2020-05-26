package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang_yg
 * @since 2020/3/24 13:57
 */
@RestController
public class ProductController {
    @RequestMapping("/product")
    public String product(){
        return "Product！";
    }
}
