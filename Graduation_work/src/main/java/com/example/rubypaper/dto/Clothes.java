package com.example.rubypaper.dto;

public class Clothes {
	private String clo_imgSrc;
	private String name;
	private int price;
	private int sales;
	private int final_price;
	private int review_stars;
	private int is_Like;	
	private int is_delete;


	public void setClo_imgSrc(String clo_imgSrc) {
		this.clo_imgSrc = clo_imgSrc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
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

	

	public int getReview_stars() {
		return review_stars;
	}

	public void setReview_stars(int review_stars) {
		this.review_stars = review_stars;
	}

	public int getIs_Like() {
		return is_Like;
	}

	public void setIs_Like(int is_Like) {
		this.is_Like = is_Like;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	@Override
	public String toString() {
		return "Clothes{" +
				"clo_imgSrc='" + clo_imgSrc + '\'' +
				", name='" + name + '\'' +
				", price=" + price +
				", sales=" + sales +
				", final_price=" + final_price +
				", review_stars=" + review_stars +
				", is_Like=" + is_Like +
				", is_delete=" + is_delete +
				'}';
	}
}
