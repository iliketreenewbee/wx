package wxWeb.domain;

import java.io.Serializable;

public class Order implements Serializable {
	
	private int id;                 //订单id
	private int buyerId;            //买家id
	private String buyerName;       //买家姓名
	private String content;         //购买内容
	private float totalPrice;       //订单总价
	private String orderTime;       //下单时间
	private String orderSituation;  //订单状态
	private String sendTime;        //送货时间段
	private String address;         //送货地址
	private String cntactPhone;     //联系电话
	private String pickCode;        //取货码
	
	
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
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderSituation() {
		return orderSituation;
	}
	public void setOrderSituation(String orderSituation) {
		this.orderSituation = orderSituation;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCntactPhone() {
		return cntactPhone;
	}
	public void setCntactPhone(String cntactPhone) {
		this.cntactPhone = cntactPhone;
	}
	public String getPickCode() {
		return pickCode;
	}
	public void setPickCode(String pickCode) {
		this.pickCode = pickCode;
	}
	
	
}
