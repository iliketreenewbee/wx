package wxWeb.domain;

import java.io.Serializable;

public class Coupon implements Serializable {
	
	private int id;           //优惠券id
	private int buyerId;      //买家id
	private float discountMoney;  //优惠金额
	private String discountType;   //优惠商品的种类
	private String condition;  //使用条件说明
	private String situation;  //使用情况
	private String type;       //优惠劵种类
	private float fullMoney;   //满减的金额
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public float getDiscountMoney() {
		return discountMoney;
	}
	public void setDiscountMoney(float discountMoney) {
		this.discountMoney = discountMoney;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getFullMoney() {
		return fullMoney;
	}
	public void setFullMoney(float fullMoney) {
		this.fullMoney = fullMoney;
	}
}
