package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	/*******************************Path Variable Annotation********************************************/

	@RequestMapping("/hi/{countryName}/{userName}")
  /* public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {

		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello "+name+ " You are from "+country);

		return model;
	}*/
	
	
	public ModelAndView helloWorld(@PathVariable ("userName")String name, @PathVariable("countryName") String country) {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello "+name+ " You are from "+country);
		return model;
	}
	
}