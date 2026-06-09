package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestParamController {
	
	// Get かつ [url : /show]
	@GetMapping("show")
	public String showView() {
		// 表示する「ビュー名」
		return "input";
	}
}
