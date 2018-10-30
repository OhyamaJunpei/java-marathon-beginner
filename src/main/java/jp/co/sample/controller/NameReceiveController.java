package jp.co.sample.controller;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 名前を受け取るコントローラ.
 * 
 * @author ohyama
 * 
 */
@Controller
@RequestMapping("/nameReceive")
public class NameReceiveController {
	
	/**
	 * 入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "inputname";
	}
	
	/**
	 * 受け取った名前を出力します.
	 * 
	 * @param name リクエストパラメータで送られてくる名前
	 * @param model　モデル
	 * @return　出力画面
	 */
	@RequestMapping("/output")
	public String output(String name, Model model) {
		model.addAttribute("name", name);
		return "outputname";
	}
	
}
