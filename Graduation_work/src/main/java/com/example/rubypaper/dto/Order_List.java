package com.example.rubypaper.dto;

import java.util.Date;

public class Order_List {
	
	private int oreder_id;
	private String size;
	private String clo_imgSrc;
	private String name;
	private int quantity;
	private int price;
	private int sales;
	private int final_price;
	private String user_id;
	private String order_date;
	private String way;


	public int getOreder_id() {
		return oreder_id;
	}

	public void setOreder_id(int oreder_id) {
		this.oreder_id = oreder_id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getClo_imgSrc() {
		return clo_imgSrc;
	}

	public void setClo_imgSrc(String clo_imgSrc) {
		this.clo_imgSrc = clo_imgSrc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getFinal_price() {
		return final_price;
	}

	public void setFinal_price(int final_price) {
		this.final_price = final_price;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	@Override
	public String toString() {
		return "Order_List{" +
				"oreder_id=" + oreder_id +
				", size='" + size + '\'' +
				", clo_imgSrc='" + clo_imgSrc + '\'' +
				", name='" + name + '\'' +
				", quantity=" + quantity +
				", price=" + price +
				", sales=" + sales +
				", final_price=" + final_price +
				", user_id='" + user_id + '\'' +
				", order_date='" + order_date + '\'' +
				", way='" + way + '\'' +
				'}';
	}
}
