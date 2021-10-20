package com.example.testjk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: testjk
 * @Description:
 * @Author: YangHao
 * @Create: 2021-10-20 11:59
 */
@RestController
public class TestLogin {

    @GetMapping("/test")
    public String test() {

        return "这是测试的消息啊测试啊";
    }

}
