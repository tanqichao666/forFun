package com.tan.forfun.observer;

public interface Observer {

    /**
     * 更新观察者的数据
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(String temp , String humidity , String  pressure);
}
