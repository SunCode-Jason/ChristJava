package com.example.christJava.Controller;

import com.example.christJava.Model.AccountModel;
import com.example.christJava.Services.AccountService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/account")
public class AccountController extends BaseController {

    @Resource(name = "accountServiceBImpl") // 多个类实现业务契约时，需要指定指明注入的名称（默认是类名的小驼峰）
    @Autowired
    private AccountService accountService;
    // 构造函数初始化
    public AccountController() {

        super("Jason", 24);
    }

    // 获取用户信息
    @GetMapping("/profile")
    public AccountModel GetAccountProfile(){
        return accountService.GetAccountProfile();
    }

    // 定义业务接口
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id ==>" + id + ", You age ==> " + account.age + "You Id ==> " + account.id);
        return "Hello " + account.name + " Hello World";

    }
}
