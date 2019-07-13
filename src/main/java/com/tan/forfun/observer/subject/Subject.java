package com.tan.forfun.observer.subject;


import com.tan.forfun.observer.Observer;

public interface Subject {
    /**
     * 注册观察值
     * @param o 观察者对象
     */
    public void registerObserver(Observer o);

    /**
     * 注销观察者
     * @param o 观察者对象
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    public void notifyObservers();

}
