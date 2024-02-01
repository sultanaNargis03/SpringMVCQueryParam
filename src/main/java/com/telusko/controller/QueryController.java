package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController 
{
	//localhost:8486/getmessage?name=nargis
	//localhost:8486/getmessage?name=nargis&course=SpringBoot
	@GetMapping("/getmessage")
	public String displayMessage(@RequestParam("name")String name,@RequestParam("course")String c,Map<String, Object> model)
	{
		String msg="Hello! "+name+" I hope you're enjoying the "+c+" course";
		model.put("msg", msg);
		return "index";
	}
}
