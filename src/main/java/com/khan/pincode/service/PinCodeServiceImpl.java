package com.khan.pincode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khan.pincode.dao.PinCodeDAO;
import com.khan.pincode.model.A;
import com.khan.pincode.model.Post;
import com.khan.pincode.util.CsvReaderUtil;

@Service
@Transactional
public class PinCodeServiceImpl implements PinCodeService {

	@Autowired
	private PinCodeDAO pinCodeDAO;
	
	List<A> pinCodeList = new ArrayList<A>();
	
	public PinCodeServiceImpl(){
		pinCodeList = CsvReaderUtil.getPinCodeData();
	}
	
	
	
	public List<?> getPinCode(String searchKey) {
		List<A> selectedPinCodeList = new ArrayList<A>();;
		if(null!=searchKey && searchKey!=""){
			String titleSearchKey;
			String capitalSearchKey = searchKey.toUpperCase();
			Character firstC = searchKey.charAt(0);
			titleSearchKey = Character.toUpperCase(firstC)+searchKey.substring(1);
			selectedPinCodeList = new ArrayList<A>();
			for(A a  :pinCodeList){
				if(a.getArea().startsWith(titleSearchKey) || a.getDistrict().startsWith(titleSearchKey)||a.getState().startsWith(capitalSearchKey)){
					selectedPinCodeList.add(a);
				}
			}
		}
		return selectedPinCodeList;
	}

	@Override
	public String postComment(Post post) {
		return pinCodeDAO.postComment(post);
	}
}
