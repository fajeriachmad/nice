package com.nice.commerce.controller;

/**
 * @author Ahmad Fajri Rahman
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message","Hello world");
		return "index";
	}
}
