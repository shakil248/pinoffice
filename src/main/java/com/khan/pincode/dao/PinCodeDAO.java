package com.khan.pincode.dao;

import java.util.List;

import com.khan.pincode.model.Post;


public interface PinCodeDAO {

	 public <T> List<T> getPinCode(Class<T> type, String searchKey);

	public String postComment(Post comment2);

}