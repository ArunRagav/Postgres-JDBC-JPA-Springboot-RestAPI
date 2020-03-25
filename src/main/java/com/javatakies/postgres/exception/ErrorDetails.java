package com.javatakies.postgres.exception;

import java.util.Date;

public class ErrorDetails {
	private Date date;
	private String details;
	private String msg;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ErrorDetails(Date date, String details, String msg) {
		super();
		this.date = date;
		this.details = details;
		this.msg = msg;
	}

}
