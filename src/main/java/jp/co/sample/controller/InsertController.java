package jp.co.sample.controller;

import java.util.LinkedList;
import java.util.List;

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
	private HttpSession session;

	@RequestMapping("/inCart")
	public String inCart(int index, String name, Integer price) {
		
		Item item = new Item();
		List<Item> cartList = new LinkedList<>();
		item.setName(name);
		item.setPrice(price);
		cartList.add(item);
		
		session.setAttribute("cartList", cartList);
		
		return "ViewCartController";
	}
	
}