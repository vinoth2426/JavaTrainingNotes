package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController {
/*************Single Action Controller and Annotation*********************/
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello world");

		return model;
	}

	/*************Multiple Action Controller and Annotation*********************/
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {

		ModelAndView model = new ModelAndView("LoginPage");
		model.addObject("loginMessage","hi HIIIIIIII");

		return model;
	}
	
	@RequestMapping("/test")
	public ModelAndView testWorld() {

		ModelAndView model = new ModelAndView("TestPage");
		model.addObject("test","hi testtesttesttest");

		return model;
	}

}