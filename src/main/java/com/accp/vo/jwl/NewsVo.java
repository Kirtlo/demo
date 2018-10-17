package com.accp.vo.jwl;

import java.util.Date;

public class NewsVo {
	private Integer newsID;
	private String userName;
	public NewsVo() {
		super();
	}
	public Integer getNewsID() {
		return newsID;
	}
	public void setNewsID(Integer newsID) {
		this.newsID = newsID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSendingTime() {
		return sendingTime;
	}
	public void setSendingTime(Date sendingTime) {
		this.sendingTime = sendingTime;
	}
	public Integer getReadState() {
		return readState;
	}
	public void setReadState(Integer readState) {
		this.readState = readState;
	}
	public Integer getNewsType() {
		return newsType;
	}
	public void setNewsType(Integer newsType) {
		this.newsType = newsType;
	}
	public Integer getMessageGroup() {
		return messageGroup;
	}
	public void setMessageGroup(Integer messageGroup) {
		this.messageGroup = messageGroup;
	}
	private String content;
	private Date sendingTime;
	private Integer readState;
	private Integer newsType;
	private Integer messageGroup;
}
