package com.basak.app.model;

public class ReviewVO {

	private int reviewId;
	private int star;
	private String comment;
	private int snackId;
	private int memberId;
	
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getSnackId() {
		return snackId;
	}
	public void setSnackId(int snackId) {
		this.snackId = snackId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
}