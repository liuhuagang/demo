package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class KeyController {

	// 方式一：String

	@RequestMapping("/")
	public String index(Map<String, Object> map) {
		map.put("name", "HelloKitty");
		map.put("age", 1);
		System.out.print("11111111");
		// 返回视图
		return "index";
	}
	@RequestMapping("/list")
	public String list(Map<String, Object> map) {
		map.put("name", "HelloKitty");
		map.put("age", 1);
		System.out.print("11111111");
		// 返回视图
		return "list";
	}
	@RequestMapping("/index")
	public String indexMain(Map<String, Object> map) {
		map.put("name", "HelloKitty");
		map.put("age", 1);
		System.out.print("11111111");
		// 返回视图
		return "list";
	}
}
