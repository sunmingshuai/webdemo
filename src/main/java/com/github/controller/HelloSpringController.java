package com.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sunms on 2017/4/24.
 */
@Controller
@RequestMapping("/")
public class HelloSpringController {

	@RequestMapping("helloSpring")
	public String helloSpring() {
		return "spring";
	}
}
