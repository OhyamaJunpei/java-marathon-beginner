package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.repository.UserDao;


/**
 * 主キー検索を行うコントローラ.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/search")
public class SearchController {
	
	/** リポジトリとの接続 */
	@Autowired
	private UserDao dao;

	
	/**
	 * 入力画面を表示
	 * 
	 * @return　入力画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "userinfosearch";
	}
	
	
	/**
	 * UserDaoのload()メソッドを使って検索して
	 * 出力画面を表示
	 * 
	 * @return 出力画面
	 */
	@RequestMapping("/output")
	public String output(Integer id) {
		
		dao.load(id);
		return "userinfoview";
	}
	
	
	
}
