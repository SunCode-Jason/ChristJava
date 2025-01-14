package com.example.christJava.Services;

import com.example.christJava.Model.AccountModel;
import com.example.christJava.Model.CarModel;
import com.example.christJava.Model.PlaneModel;
import com.example.christJava.Model.ToyModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AccountServiceBImpl implements  AccountService{

    private  final AccountModel accountModel;
    public AccountServiceBImpl() {
        accountModel= new AccountModel();
        accountModel.id = UUID.randomUUID().toString();
        accountModel.age = 25;
        accountModel.name = "Jason Doe";
        accountModel.toyList=new ArrayList<>();
        accountModel.toyList.add(new CarModel("cal"));
        accountModel.toyList.add(new CarModel("cal"));
        accountModel.toyList.add(new PlaneModel("plane"));
    }
    @Override
    public AccountModel GetAccountProfile() {
        return accountModel;
    }

    @Override
    public List<ToyModel> GetToys() {
        return List.of();
    }
}
