package com.sn.miaosha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sn.miaosha.controller.DemoController;


@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) throws Exception{
		//2 1是注释
		SpringApplication.run(MainApplication.class, args);
	}
}
