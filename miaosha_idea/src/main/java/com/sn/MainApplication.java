package com.sn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    //第一次无法找到页面404 然后位置外移就没事了，不知道是不是
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplication.class, args);
    }
}