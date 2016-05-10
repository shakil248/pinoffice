package com.khan.pincode.service;

import java.util.List;

import com.khan.pincode.model.Post;

public interface PinCodeService {

	List<?> getPinCode(String searchKey);

	String postComment(Post post);

}
