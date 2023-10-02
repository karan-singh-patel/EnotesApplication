package com.user;

import java.util.Date;

public class Post {
	private int cid;
	private String title;
	private String content;
	private Date pdate;
	private UserDetails user;
	
	
	public Post() {
		super();
	}
	public Post(int cid, String title, String content, Date pdate, UserDetails user) {
		super();
		this.cid = cid;
		this.title = title;
		this.content = content;
		this.pdate = pdate;
		this.user = user;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
}
