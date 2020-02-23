package com.wego.web.enums;

public enum Path {
	UPLOAD_PATH, CRAWLING_TARGET;
	@Override
	public String toString() {
		String result = "";
		switch (this) {
		case UPLOAD_PATH:
			result = "C:\\Users\\eunb9\\git\\temwego11\\src\\main\\webapp\\resources\\upload\\";
			break;
		case CRAWLING_TARGET: 
			result = "hhttps://store.naver.com/accommodations/detail?entry=plt&id=1285629759&tab=bookingReview&tabPage";
			break;

		}
		return result;
	}
}
