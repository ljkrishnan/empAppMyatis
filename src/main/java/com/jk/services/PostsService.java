package com.jk.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.entity.Post;
import com.jk.mapper.PostMapper;



@Service
public class PostsService {
	
	@Autowired
	private PostMapper empMapper;
	
	
//Returns all the available employees
	public List<Post> getPosts() {
		
		return empMapper.getAllEmps();

	}
	
	
//Returns employee with particular ID
	
	public Post getPost(int id) {
	
	return empMapper.getPost(id);
}	
	
//Inserts an employee into employee table
	public void addPost(Post listElement) {
		empMapper.insertPost(listElement);
	
	}	
	
//Updates an employee with same ID as in payload otherwise inserts as new employee into employee table
	public void updatePost(Post post) {
	
		empMapper.updatePost(post);
		
	}
	
	
//Deletes employee with particular ID
	public void deletePost(int id) {

		empMapper.deletePost(id);

	}	
	
}
