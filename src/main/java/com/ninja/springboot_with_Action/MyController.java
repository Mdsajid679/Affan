package com.ninja.springboot_with_Action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// this is test run hello
@RestController
public class MyController {
	@RequestMapping("/test")
	public String test()
	{
		return "hello springboot app";
	}
	@RequestMapping("/function")
	public String function()
	{
		return "This is my second web page in Github Action";
	}

}
