package com.niit.collaboration.dao;

import java.util.List;

import com.niit.collaboration.model.Blog;


public interface BlogDAO {
	
	List<Blog> getAllBlogs();// In order to fetch all the Blogs
	Blog getBlog(String id);// In order to fetch a particular blog on the basis of id
	

}