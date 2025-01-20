package com.example.firstJava.Controller;

import com.example.firstJava.Model.AccountModel;
import com.example.firstJava.Model.User;
import com.example.firstJava.Repository.UserRepository;
import com.example.firstJava.Service.UserService;
import com.example.firstJava.Services.AccountService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping("/account")
public class AccountController extends BaseController {

    @Resource(name = "accountServiceBImpl") // 多个类实现业务契约时，需要指定指明注入的名称（默认是类名的小驼峰）
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserService userService;
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

    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    @ResponseBody
    /*
     * List 里的对象是Map对象，而Map对象是
     * 由一个String类型的键和Object类型的值组成
     * */
    public List<User> getUsers(){
        List<User> list = new ArrayList<User>();
        list = userService.findAll();
        return list;
    }
}
