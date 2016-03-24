package com.chipmonk.hellocontroller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController{

	@RequestMapping("/welcome/{countryname}/{username}")
	//public ModelAndView helloworld(@PathVariable("username") String username,@PathVariable("countryname") String countryname)
	public ModelAndView helloworld(@PathVariable Map<String,String> pathVars)		
			throws Exception {
		String username = pathVars.get("username");
		String countryname = pathVars.get("countryname");
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("WelcomeMessage","hello user welcome to first mvc web application annotation  "+username+"  "+countryname);
		return modelandview;
	}
	@RequestMapping("/hi")
	public ModelAndView hiworld()
			throws Exception {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("WelcomeMessage","Hi user welcome to first mvc web application annotation");
		return modelandview;
	}
}
