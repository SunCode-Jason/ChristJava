package com.example.firstJava.Model;

import java.util.List;

public abstract class BaseAccountModel<TType extends ToyModel> extends BaseModel {

    public abstract String Say();

    public List<TType> toyList;

    // 添加玩具
    public void pushToy(TType toy){
        toyList.add(toy);
    }

    // 删除玩具
    public  boolean  removeToy(TType toy){
       return toyList.remove(toy);
    }

    // 获取玩具数量
    public  int Count(){
        return toyList.size();
    }

}
