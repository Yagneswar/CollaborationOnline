package com.niit.collaboration.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.dao.BlogDAO;
import com.niit.collaboration.model.Blog;



@Repository
@Transactional
public class BlogDAOImpl  implements BlogDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Blog> getAllBlogs() {
		// TODO Auto-generated method stub
	return sessionFactory.getCurrentSession().createQuery("from Blog").list();
	}

	@Override
	public Blog getBlog(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
