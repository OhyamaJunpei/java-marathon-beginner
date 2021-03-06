package jp.co.sample.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Item;


/**
 * 商品をカートに入れるコントローラ.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/insert")
public class InsertController {
	
	@Autowired
	private ServletContext application;

	@Autowired
	private HttpSession session;
	
	
	/**
	 * 指定されたindex番号のitemをcartListに入れる.
	 * 
	 * @param index itemの番号
	 * @return　合計金額を計算するクラス
	 */
	@RequestMapping("/inCart")
	public String inCart(int index) {
		@SuppressWarnings("unchecked")
		List<Item> itemList = (List<Item>) application.getAttribute("itemList");
		
		Item item = itemList.get(index);
		
		@SuppressWarnings("unchecked")
		List<Item> cartList = (List<Item>) session.getAttribute("cartList");
		cartList.add(item);

		return "itemAndCart";
	}
	
}