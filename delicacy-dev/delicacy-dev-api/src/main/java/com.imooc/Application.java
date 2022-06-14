package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot可执行类  （启动类）
@SpringBootApplication
//扫描com.imooc包下的及子包下的所有的注解的类
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
}
