package com.example.rubypaper.dto;

public class Cart {

	private int cart_id;
	private String user_id;
	private String clo_imgSrc;
	private String name;
	private int price;
	private int quantity;
	private String size;
	private int is_delete;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	@Override
	public String toString() {
		return "Cart{" +
				"cart_id=" + cart_id +
				", user_id='" + user_id + '\'' +
				", clo_imgSrc='" + clo_imgSrc + '\'' +
				", name='" + name + '\'' +
				", price=" + price +
				", quantity=" + quantity +
				", size='" + size + '\'' +
				", is_delete=" + is_delete +
				'}';
	}
}
