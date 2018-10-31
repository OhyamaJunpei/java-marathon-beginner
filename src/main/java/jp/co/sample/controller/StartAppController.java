package jp.co.sample.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Item;


/**
 * 初期画面を表示するコントローラ.
 * 
 * @author junpei.oyama
 *
 */
@Controller
@RequestMapping("/startApp")
public class StartAppController {

	/** sessionスコープ */
	@Autowired
	private HttpSession session;
	/** applicationスコープ */
	@Autowired
	private ServletContext application;
	
	
	/**
	 * 商品をリストに入れて初期画面を表示.
	 * 
	 * @param model リクエストスコープ
	 * @return 初期画面
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		
		List<Item> itemList = new ArrayList<>();
		Item item1 = new Item();
		item1.setName("手帳セット");
		item1.setPrice(1000);
		itemList.add(0, item1);
		
		Item item2 = new Item();
		item2.setName("文房具セット");
		item2.setPrice(1500);
		itemList.add(1, item2);
		
		Item item3 = new Item();
		item3.setName("ファイル");
		item3.setPrice(2000);
		itemList.add(2, item3);
		
		application.setAttribute("itemList", itemList);
		
		List<Item> cartList = new LinkedList<>();
		session.setAttribute("cartList", cartList);
		
		int total = 0;
		model.addAttribute("total", total);
		
		return "itemAndCart";
	}
}

