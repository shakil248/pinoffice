package com.khan.pincode.dao;

import org.springframework.stereotype.Repository;

import com.khan.pincode.model.Post;

@Repository
public class PinCodeDAOImpl extends BaseDAO implements PinCodeDAO{

	@Override
	public void postComment(Post comment2) {
			persist(comment2);
	}
	
}
