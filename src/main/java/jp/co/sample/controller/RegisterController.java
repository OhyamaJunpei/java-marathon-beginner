package jp.co.sample.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ohyama
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	
	/** applicationスコープを利用 */
	@Autowired
	private ServletContext application;
	
	/**
	 * 初期画面
	 * @return　入力画面にフォワード
	 */
	@RequestMapping("/index")
	public String index() {
		return "buygoods";
	}
	
	
}
