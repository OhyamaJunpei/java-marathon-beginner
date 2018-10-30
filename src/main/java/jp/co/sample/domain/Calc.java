package jp.co.sample.domain;

/**
 * @author ohyama
 *
 */
public class Calc {
	
	/** 入力値1 */
	private Integer num1;
	/** 入力値2 */
	private Integer num2;
	/** 入力値1 * 入力値2 */
	private Integer answer;
	
	//getter,setter
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	public Integer getNum2() {
		return num2;
	}
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	public Integer getAnswer() {
		return answer;
	}
	public void setAnswer(Integer answer) {
		this.answer = answer;
	}
	
}
