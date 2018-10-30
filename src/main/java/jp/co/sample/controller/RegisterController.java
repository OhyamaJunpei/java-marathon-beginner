package jp.co.sample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("/")
	public String index() {
//		
//		List<String> itemList;
//		itemList = (List<String>) application.getAttribute("itemList");
//		
//		if(itemList == null) {
//			itemList = new ArrayList<>();
//		}
//		application.setAttribute("itemList", itemList);
//		
		return "buygoods";
	}
	
	@RequestMapping("/total")
	public String total(String price1, String price2, String price3) {
		List<String> itemList = new ArrayList<>();
		application.setAttribute("price1", price1);
		application.setAttribute("price2", price2);
		application.setAttribute("price3", price3);
		
//		itemList.add(Integer.parseInt(price1));
		
		
		return null;
	}
	
}
