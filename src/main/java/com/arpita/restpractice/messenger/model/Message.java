package com.arpita.restpractice.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private int id;
	private String message;
	private Date createDate;
	private String author;
	
	
	public Message() {
		
	}
	
	public Message(int id, String message, Date createDate, String author) {
		super();
		this.id = id;
		this.message = message;
		this.createDate = createDate;
		this.author = author;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
