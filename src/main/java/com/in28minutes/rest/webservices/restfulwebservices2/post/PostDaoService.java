package com.in28minutes.rest.webservices.restfulwebservices2.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices2.user.User;

@Component
public class PostDaoService {
	private static List<Post> posts = new ArrayList<>();
	private static User user1 = new User(1, "Adam", new Date());
	private static User user2 = new User(2, "Eve", new Date());
	private static User user3 = new User(3, "Samuel", new Date());
	
	private static int postsCount = 4;
	
	static {
		posts.add(new Post(1, "All about RESTFul services", "Lorem ipsum", new Date(), user1));
		posts.add(new Post(2, "Learn Microservices", "Lorem ipsum", new Date(), user2));
		posts.add(new Post(3, "Cloud Microservices", "Lorem ipsum", new Date(), user3));
		posts.add(new Post(4, "All about Python", "Lorem ipsum", new Date(), user1));
	}
	
	//findAll(user_id)
	public List<Post> findAll(int userId) {
		List<Post> userPosts = new ArrayList<>();
		for(Post post:posts) {
			if(post.getUser().getId()==userId) {
				userPosts.add(post);
			}
		}
		
		if(userPosts.size()>0)
			return userPosts;
		
		return null;
	}
	
	//Save
	public Post save(int id, Post post) {
		Post userPost = null;
		if(post.getId()==id) {
			userPost = new Post(post.getId(), post.getTitle(), post.getDescription(), post.getCreationDate(), post.getUser());	
		} else {
			User user = new User(id, post.getUser().getName(), post.getUser().getBirthDate());
			userPost = new Post(post.getId(), post.getTitle(), post.getDescription(), post.getCreationDate(), user);								
		} 
//		for(Post post:posts) {
//			if(post.getUser().getId() == id) {
//				userPost = new Post(++postsCount, "Boost Microservices", "Lorem ipsum", new Date(), post.getUser());				
//			} else {
//				User user = new User(id, "Jack", new Date());
//				userPost = new Post(++postsCount, "Sprint Boot Microservices", "Lorem ipsum", new Date(), user);								
//			}			
//		}
		posts.add(userPost);
		
		return userPost;
	}

}
