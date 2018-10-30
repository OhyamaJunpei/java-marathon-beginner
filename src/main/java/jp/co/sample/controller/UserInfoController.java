package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.User;

/**
 * @author ohyama
 *
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	/** 入力画面 */
	@RequestMapping("/index")
	public String index() {
		return "inputuserinfo";
	}
	
	/** 出力画面 */
	@RequestMapping("/output")
	public String output(String name, String age, String address, Model model) {
		
		User user = new User();
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		user.setAddress(address);
		
		model.addAttribute("user", user);
		
		return "outputuserinfo";
		
	}
	
}
