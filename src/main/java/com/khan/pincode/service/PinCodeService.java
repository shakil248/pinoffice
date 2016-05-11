package com.khan.pincode.service;

import java.util.List;

import com.khan.pincode.model.Post;

public interface PinCodeService {

	List<?> getPinCode(String searchKey);

	void postComment(Post post);

	List<?> getLocation(String searchKey);

}
