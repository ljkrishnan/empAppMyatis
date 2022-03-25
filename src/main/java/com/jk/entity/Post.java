package com.jk.entity;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Post {
	

	int postId;
	

	@NotBlank(message = "Please enter Name")
	@Pattern(regexp="^[a-zA-Z/ /]+", message="Invalid Name!")
	@Size(min=3, message = "Name should be atleast 3 characters")
	@Size(max=20, message = "Name should not be greater than 20 characters")
	String empName;
	

	@NotNull(message = "Please enter Age")
	@Min(value=18, message="Age must be equal or greater than 18")  
    @Max(value=56, message="Age must be equal or less than 56") 
	int empAge;
	

	@NotBlank(message = "Please enter Profession")
	@Size(min=2, message = "Profession should be atleast 2 characters")
	@Size(max=20, message = "Profession should not be greater than 20 characters")
	@Pattern(regexp="^[a-zA-Z0-9-/ /]+", message="Invalid Profession (Characters allowed are a-z, A-Z, Space & -)!")
	String profession;
	
	//Default Constructor
	public Post() {
		
	}
	
	//Parameterized Constructor
	public Post(int postId, String empName, int empAge, String profession) {
		
		this.postId = postId;
		this.empName = empName;
		this.empAge = empAge;
		this.profession = profession;
	}
	
	//Getters & Setters
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	//toString method
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", empName=" + empName + ", empAge=" + empAge + ", profession=" + profession
				+ "]";
	}
		
	
}
