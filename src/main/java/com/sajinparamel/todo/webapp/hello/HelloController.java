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


    @RequestMapping("hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("HTML Sample Page");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("HTML Sample Body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("hello-jsp")
    public String sayHelloJSP() {
        return "SayHello";
    }
}