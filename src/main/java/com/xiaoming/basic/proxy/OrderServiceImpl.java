package com.xiaoming.basic.proxy;

public class OrderServiceImpl implements OrderService {

    @Override
    public void showOrder() {
        System.out.println("order的核心功能");
        throw new RuntimeException("测试异常....");
    }
}
