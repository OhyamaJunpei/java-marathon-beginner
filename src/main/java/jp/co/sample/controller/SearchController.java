package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 主キー検索を行うコントローラ.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/search")
public class SearchController {

	
	/**
	 * 入力画面を表示
	 * 
	 * @return　入力画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "userinfosearch";
	}
	
	
	
}
