package wxWeb.domain;

import java.io.Serializable;

public class PickPoint implements Serializable {
	
	private int id;            //id
	private String name;       //提货点名称
	private String isValue;    //当前提货点是否有效
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsValue() {
		return isValue;
	}
	public void setIsValue(String isValue) {
		this.isValue = isValue;
	}
}
