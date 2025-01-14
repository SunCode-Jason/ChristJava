package com.example.christJava.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController extends BaseController {

    // 构造函数初始化
    public AccountController() {
        super("Jason", 24);
    }

    // 定义业务接口
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id ==>" + id + ", You age ==> " + account.age + "You Id ==> " + account.id);
        return "Hello " + account.name + " Hello World";

    }
}
