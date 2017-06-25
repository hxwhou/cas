package com.ibm.cas.suba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cas.service.impl.GreetService;

@RestController
@RequestMapping("/rest/cas/v1/greet")
public class GreetController {
	
	@Autowired
	private GreetService greetService;

	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public String sayHello(@RequestParam String name) {
		return greetService.sayHello(name);
	}
}
