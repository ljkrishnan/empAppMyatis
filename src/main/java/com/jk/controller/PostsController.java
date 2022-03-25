package com.jk.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jk.entity.Post;

import com.jk.services.PostsService;




@RestController
public class PostsController {

	@Autowired
	private PostsService service;
	

// 1) Will create an employee in the employee table.
	@RequestMapping(method = RequestMethod.POST, value = "/POST/employee")
	public void addPost(@Valid @RequestBody Post listElement) {

		service.addPost(listElement);

	}	
	

// 2) Will fetch an employee from the employee table as per given id. If id is not specified it will return all employees.
	@RequestMapping("/GET/employee/{id}")
	public Post getPost(@PathVariable int id) {

		return service.getPost(id);
		
	}

	@RequestMapping("/GET/employee")
	public List<Post> getPosts() {

		return service.getPosts();
		

	}

// 3) will update an employee with the given id and given payload.
	@RequestMapping(method = RequestMethod.PUT, value = "PUT/employee")
	public void updatePost(@RequestBody Post post) {

		service.updatePost(post);
	

	}

// 4) will delete an employee with the given id from the employee table.
	@RequestMapping(method = RequestMethod.DELETE, value = "DELETE/employee/{id}")
	public void deletePost(@PathVariable int id) {

		service.deletePost(id);
		

	}
	
//5) Will show employees with IDs
	  @RequestMapping("/GET/employee/ids/{employeeIds}")
	  public List<Post> trigger(@PathVariable String employeeIds) {
	        List<String> ids = Arrays.asList(employeeIds.split(","));
	        List<Post> list = new ArrayList<>();
	        for(String id:ids)
            {
	        	
	        	int v_id=Integer.parseInt(id);  
	        	list.add(service.getPost(v_id));
	        	
            }
			return list;
	  }

//6) Will Delete employees with IDs
	  @RequestMapping(method = RequestMethod.DELETE, value = "DELETE/employee/ids/{employeeIds}")
	  public void triggerDel(@PathVariable String employeeIds) {
	        List<String> ids = Arrays.asList(employeeIds.split(","));
	        
	        for(String id:ids)
            {
	        	
	        	int v_id=Integer.parseInt(id);  
	        	service.deletePost(v_id);
	        	
            }
			
	  }

}
