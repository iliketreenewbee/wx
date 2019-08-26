package wxWeb.domain;

import java.io.Serializable;

public class ShoppingCar implements Serializable{
	
	private int buyerId;     //买家id作为购物车id
	private String content;  //购物车内容，用字符串存储商品
	
	
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
