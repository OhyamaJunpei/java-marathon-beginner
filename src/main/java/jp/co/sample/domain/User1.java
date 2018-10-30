package jp.co.sample.domain;


/**
 * ユーザー情報を表すドメイン
 * 
 * @author junpei.oyama
 *
 */
public class User1 {
	
	/** id */
	private Integer id;
	/** 名前 */
	private String name;
	/** 年齢 */
	private String age;
	/** 住所 */
	private String address;
	
	/** getter,setter */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
