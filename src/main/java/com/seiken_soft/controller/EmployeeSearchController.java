package com.seiken_soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class EmployeeSearchController {
	
	@GetMapping("/") // "/search"以降のURL(GET)
	public String init(Model model) {
		
		 // RequestMappingの引数にModelを指定することで、
	    // テンプレートで使用するモデルに値を格納できる
	    model.addAttribute("message", "Hello, Template World!");
		
		return "searchEmployee"; //HTMLファイル名
	}

	
	
 
}
