package com.example.rubypaper.dto;

public class Review {
	
	private String review_id;
	private String clo_imgSrc;
	private int rating;
	private String reviewText;
	public String getReview_id() {
		return review_id;
	}
	public void setReview_id(String review_id) {
		this.review_id = review_id;
	}

	public String getClo_imgSrc() {
		return clo_imgSrc;
	}

	public void setClo_imgSrc(String clo_imgSrc) {
		this.clo_imgSrc = clo_imgSrc;
	}

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	@Override
	public String toString() {
		return "Review{" +
				"review_id='" + review_id + '\'' +
				", clo_imgSrc='" + clo_imgSrc + '\'' +
				", rating=" + rating +
				", reviewText='" + reviewText + '\'' +
				'}';
	}
}
