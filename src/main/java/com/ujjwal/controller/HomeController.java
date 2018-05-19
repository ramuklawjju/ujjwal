package com.ujjwal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ujjwal
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
}
