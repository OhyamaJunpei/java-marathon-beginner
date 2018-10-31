package jp.co.sample.domain;


/**
 * 商品を表すドメイン.
 * 
 * @author junpei.oyama
 *
 */
public class Item {

	/** 名前 */
	private String name;
	/** 価格 */
	private Integer price;
	
	/** getter,setter */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
