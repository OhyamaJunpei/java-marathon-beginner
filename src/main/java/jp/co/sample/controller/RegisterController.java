package jp.co.sample.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 入力を受け取って合計金額を税込み金額を計算する.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	
	/** applicationスコープを利用 */
	@Autowired
	private ServletContext application;
	
	/**
	 * 入力画面を表示.
	 * @return　入力画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "buygoods";
	}
	
	/**
	 * 
	 * 商品の合計金額と税込み金額を計算する.
	 * 
	 * @param goods1 商品1の金額
	 * @param goods2 商品2の金額
	 * @param goods3 商品3の金額
	 * @param total 商品の合計金額
	 * @param tax 商品の税込み金額
	 * 
	 * @return 出力画面
	 */
	@RequestMapping("/total")
	public String total(String goods1, String goods2, String goods3) {
		
		int total = Integer.parseInt(goods1) + Integer.parseInt(goods2) + Integer.parseInt(goods3);
		
		int tax = (int)(total * 1.08);
		
		application.setAttribute("total", total);
		application.setAttribute("tax", tax);
		
		return "totalprice";
	}
	
}
