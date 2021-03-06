package com.sn.miaosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sn.miaosha.domain.User;
import com.sn.miaosha.result.CodeMsg;
import com.sn.miaosha.result.Result;
import com.sn.miaosha.service.UserService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	
	//1.接口输出 2.输出页面
	@RequestMapping("/hello")
	@ResponseBody
	public Result<String> hello(){
		//Result.success(data);
		//return new Result(0,"success","hello,yui");
		return Result.success("hello,sn");
	}
	
	@RequestMapping("/helloError")
	@ResponseBody
	public Result<String> helloError(){
		return Result.error(CodeMsg.SERVER_ERROR);
		
	}
	
	@RequestMapping("/thymeleaf")
	public String thymeleaf(Model model){
		model.addAttribute("name","余一老婆");
		return "hello";
		
	}
	
	@RequestMapping("/db/get")
	@ResponseBody
	public Result<User> dbGet(){
		User user=userService.getById(1);
		
		return Result.success(user);
		
	}
	
	@RequestMapping("/db/tx")
	@ResponseBody
	public Result<Boolean> dbTx(){
		userService.tx();
		
		return Result.success(true);
		
	}
	
}
