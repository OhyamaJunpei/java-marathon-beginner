package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ohyama
 *
 */
@Controller
@RequestMapping("userInfo")
public class UserInfoController {

	/** 入力画面 */
	@RequestMapping("/index")
	public String index() {
		return "inputuserinfo";
	}
	
	/** 出力画面 */
	@RequestMapping("/output")
	public String output(String name, String age, String address, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("address", address);
		
		return "outputuserinfo";
		
	}
	
}
