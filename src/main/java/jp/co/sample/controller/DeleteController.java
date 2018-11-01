package jp.co.sample.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Item;

@Controller
@RequestMapping("/delete")
public class DeleteController {

	@Autowired
	private ServletContext application;

	@Autowired
	private HttpSession session;
	
	@RequestMapping("/outCart")
	public String outCart(int index) {
		@SuppressWarnings("unchecked")
		List<Item> itemList = (List<Item>) application.getAttribute("itemList");
		
		Item item = itemList.get(index);
		
//		@SuppressWarnings("unchecked")
//		List<Item> cartList = session.removeAttribute("cartList");
//		cartList.remove(item);
		
		
		return "itemAndCart";
	}
	
}
