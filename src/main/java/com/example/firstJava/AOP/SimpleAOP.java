package com.example.firstJava.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component // 标记为IOC组件
@Aspect // 标记为AOP类
public class SimpleAOP {

    //  参数是一个表达式，表示针对哪些特定方法进行编程
    //  com.example.christJava.Services 包名
    //  第一个*代表任意返回值 第二个*代表类名或者接口名  第三个*代表方法名
    @Around("execution(* com.example.firstJava.Services.*.*(..))") //切入点表达式
    public Object recordTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 请求开始的时间点
        long begin = System.currentTimeMillis();

        // result 原始方法执行返回值
        Object result = proceedingJoinPoint.proceed();//调用原始方式运行

        // 请求结束的时间点
        long end = System.currentTimeMillis();

        // proceedingJoinPoint.getSignature() 获取方法的签名，我们就知道是哪个方法了
        // 如： AccountModel com.example.christJava.Services.AccountServiceBImpl.GetAccountProfile() 执行耗时：239ms
        System.out.print(proceedingJoinPoint.getSignature() + "执行耗时：" + (end - begin) + "ms\n");
        // 原始方法的返回值我们需要返回回去
        return result;
    }
}
