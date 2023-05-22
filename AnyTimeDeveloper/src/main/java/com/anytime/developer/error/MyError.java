package com.anytime.developer.error;

import java.time.LocalDateTime;

public class MyError {
      
	   private LocalDateTime stamp;
	   
	   private String message;
	   
	   
	   private String url;
	   
	   
	public MyError() {
		
	}


	public MyError(LocalDateTime stamp, String message, String url) {
		super();
		this.stamp = stamp;
		this.message = message;
		this.url = url;
	}


	public LocalDateTime getStamp() {
		return stamp;
	}


	public void setStamp(LocalDateTime stamp) {
		this.stamp = stamp;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	   
	   
	   
}
