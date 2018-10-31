package jp.co.sample.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/insert")
public class InsertController {
	
	@Autowired
	private ServletContext application;
	
	@Autowired
	private HttpSession session;

	@RequestMapping("/inCart")
	public String inCart(int index, String name, Integer price) {
				
		session.setAttribute("name", name);
		session.setAttribute("price", price);
		
		return "ViewCartController";
	}
	
}