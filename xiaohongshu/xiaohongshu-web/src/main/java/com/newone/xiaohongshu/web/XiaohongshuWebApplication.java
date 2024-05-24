package com.newone.xiaohongshu.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.newone.xiaohongshu.*"})
@MapperScan("com.newone.xiaohongshu.web.mapper")
public class XiaohongshuWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaohongshuWebApplication.class, args);
	}

}
