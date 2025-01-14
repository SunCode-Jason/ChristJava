package com.example.firstJava.Services;

import com.example.firstJava.Model.AccountModel;
import com.example.firstJava.Model.ToyModel;

import java.util.List;

// 用户服务契约
public interface AccountService {

    // 获取用户信息
    AccountModel GetAccountProfile();
    // 玩具列表
    List<ToyModel> GetToys();

}
