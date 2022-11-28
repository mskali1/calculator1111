package com.example.cal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	

	@RequestMapping("/")
	public String Home() {
		return "index.jsp";
	}
	
	@RequestMapping("calculator")
	public String calculator(@RequestParam("num1")int i,@RequestParam("num2")int j,HttpSession session) {
		
		int Add = i+j;
		int Sub = i-j;
		int Dev = i/j;
		int Mul = i*j;
		
		session.setAttribute("add", Add);
		session.setAttribute("sub", Sub);
		session.setAttribute("dev", Dev);
		session.setAttribute("mul", Mul);
		

		
		
		return "result.jsp";
		
	}


}
