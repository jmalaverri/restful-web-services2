package com.in28minutes.rest.webservices.restfulwebservices2.post;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.rest.webservices.restfulwebservices2.user.User;

@RestController
public class PostResource {
	@Autowired
	private PostDaoService service;
	
	//GET /users/{id}/posts
	@GetMapping("/users/{id}/posts")
	public List<Post> retrievePostsByUser(@PathVariable int id) {
		return service.findAll(id);
	}
	
	@PostMapping("/users/{id}/posts")
	public ResponseEntity<Object> createPost(@PathVariable int id, @RequestBody Post post) {
		Post savedPost = service.save(id, post);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedPost.getId()).toUri();
			
			return ResponseEntity.created(location).build();
	}

}
