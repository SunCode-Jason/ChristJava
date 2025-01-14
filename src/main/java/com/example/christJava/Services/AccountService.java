package com.example.christJava.Services;

import com.example.christJava.Model.AccountModel;
import com.example.christJava.Model.ToyModel;

import java.util.List;

// 用户服务契约
public interface AccountService {

    // 获取用户信息
    AccountModel GetAccountProfile();
    // 玩具列表
    List<ToyModel> GetToys();

}
