package com.sajinparamel.todo.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

@RequestMapping("hello-map")
@ResponseBody
public String sayHello() {
	return "Hello Good Day for Programming";
}
}
