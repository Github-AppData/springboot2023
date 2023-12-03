package com.example.rubypaper.dto;

public class Like_tb {
	
	private int like_id;
	private int link_id;
	private int price;
	private String clo_imgSrc;
	private String name;
	private String user_id;

	public int getLike_id() {
		return like_id;
	}

	public void setLike_id(int like_id) {
		this.like_id = like_id;
	}

	public int getLink_id() {
		return link_id;
	}

	public void setLink_id(int link_id) {
		this.link_id = link_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Like_tb{" +
				"like_id=" + like_id +
				", link_id=" + link_id +
				", price=" + price +
				", clo_imgSrc='" + clo_imgSrc + '\'' +
				", name='" + name + '\'' +
				", user_id='" + user_id + '\'' +
				'}';
	}
}
