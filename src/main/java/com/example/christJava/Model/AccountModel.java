package com.example.christJava.Model;

import java.util.ArrayList;


public class AccountModel extends BaseAccountModel<ToyModel> implements Interactional {

    public String name;

    public int age;

    public AccountModel() {
        toyList = new ArrayList<>();
    }

    // 实现抽象基类
    @Override
    public String Say() {
        return "Account Say Hello";
    }

    // 实现契约基类
    @Override
    public String Run() {
        return "";
    }

    // 添加玩具
    public <TType extends ToyModel> void newToy(TType toy) {
        pushToy(toy);
    }

}
