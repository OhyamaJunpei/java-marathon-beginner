package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ohyama
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	
	/**
	 * 初期画面
	 * @return　入力画面にフォワード
	 */
	@RequestMapping("/index")
	public String index() {
		return "buygoods";
	}

}
