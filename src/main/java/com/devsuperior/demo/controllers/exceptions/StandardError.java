package com.devsuperior.demo.controllers.exceptions;

import java.time.Instant;

public class StandardError {

	private Instant timestamp;
	private Integer status;
	private String message;
	private String error;
	private String path;

	public StandardError() {

	}

	public StandardError(Instant timestamp, Integer status, String message, String error, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.error = error;
		this.path = path;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
