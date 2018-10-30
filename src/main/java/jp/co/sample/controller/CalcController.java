package jp.co.sample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Calc;



/**
 * @author ohyama
 *
 */
@Controller
@RequestMapping("/calc")
public class CalcController {

	/** sessionスコープを利用 */
	@Autowired
	private HttpSession session;
	
	/** 初期画面 */
	@RequestMapping("/index")
	public String index() {
		return "inputvalue";
	}
	
	/** 計算して結果をanswerにset 出力画面 */
	@RequestMapping("/result")
	public String result(String num1, String num2) {
		
		Calc calc = new Calc();
		calc.setNum1(Integer.parseInt(num1));
		calc.setNum2(Integer.parseInt(num2));
		
		Integer num3 = Integer.parseInt(num1);
		Integer num4 = Integer.parseInt(num2);
		calc.setAnswer(num3 * num4);
		
		session.setAttribute("calc", calc);
		
		return "outputvalue";
	}
	
	/** outputvalue2へ移動 */
	@RequestMapping("/output")
	public String output() {
		return "outputvalue2";
	}
	
}
