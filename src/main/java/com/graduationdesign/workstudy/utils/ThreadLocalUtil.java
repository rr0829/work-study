package com.graduationdesign.workstudy.utils;

public class ThreadLocalUtil {
    //提供一个ThreadLocal对象
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    //获取存储值
    public static <T> T get(){
        return (T) threadLocal.get();
    }

    //存储值
    public static void set(String value){
        threadLocal.set(value);
    }
    //清除值
    public static void remove(){
        threadLocal.remove();
    }
}
