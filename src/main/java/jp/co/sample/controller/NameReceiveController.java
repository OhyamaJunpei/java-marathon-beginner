package jp.co.sample.controller;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ohyama
 * 
 */
@Controller
@RequestMapping("/nameReceive")
public class NameReceiveController {
	
	/** 入力画面 */
	@RequestMapping("/index")
	public String index() {
		return "inputname";
	}
	
	/** 出力画面 */
	@RequestMapping("/output")
	public String output(String name, Model model) {
		model.addAttribute("name", name);
		return "outputname";
	}
	
}
