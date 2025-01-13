package com.example.demo.Controller;


import com.example.demo.Model.AccountModel;

import java.util.UUID;

// Controller 基类
public class BaseController {

    // 引入实体类
    public AccountModel account;

    // 构造函数初始化实体类
    public BaseController(String name, Integer age) {
        account = new AccountModel();
        account.name = name;
        account.age = age;
        account.id = UUID.randomUUID().toString();
    }
}
