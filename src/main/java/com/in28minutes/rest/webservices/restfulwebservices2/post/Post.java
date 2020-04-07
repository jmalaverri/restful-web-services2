package com.in28minutes.rest.webservices.restfulwebservices2.post;

import java.util.Date;

import com.in28minutes.rest.webservices.restfulwebservices2.user.User;

public class Post {
	private Integer id;
	private String title;
	private String description;
	private Date creationDate;
	private User user;
	
	public Post(Integer id, String title, String description, Date creaDate, User user) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.creationDate = creaDate;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title +", description=" + description +", creationDate=" + creationDate +"]";
	}

}
