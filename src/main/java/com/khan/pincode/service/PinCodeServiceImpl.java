package com.khan.pincode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khan.pincode.dao.PinCodeDAO;
import com.khan.pincode.model.PinCode;
import com.khan.pincode.model.Post;
import com.khan.pincode.util.CsvReaderUtil;

@Service
@Transactional
public class PinCodeServiceImpl implements PinCodeService {

	@Autowired
	private PinCodeDAO pinCodeDAO;
	
	List<PinCode> pinCodeList = new ArrayList<PinCode>();
	
	public PinCodeServiceImpl(){
		pinCodeList = CsvReaderUtil.getPinCodeData();
	}
	
	
	
	public List<?> getPinCode(String searchKey) {
		List<PinCode> selectedPinCodeList = new ArrayList<PinCode>();;
		if(null!=searchKey && searchKey!=""){
			String titleSearchKey;
			String capitalSearchKey = searchKey.toUpperCase();
			Character firstC = searchKey.charAt(0);
			titleSearchKey = Character.toUpperCase(firstC)+searchKey.substring(1);
			for(PinCode a  :pinCodeList){
				if(a.getArea().startsWith(titleSearchKey) || a.getDistrict().startsWith(titleSearchKey)||a.getState().startsWith(capitalSearchKey)){
					selectedPinCodeList.add(a);
				}
			}
		}
		return selectedPinCodeList;
	}

	@Override
	public void postComment(Post post) {
		 pinCodeDAO.postComment(post);
	}



	@Override
	public List<?> getLocation(String searchKey) {
		List<PinCode> selectedPinCodeList = new ArrayList<PinCode>();;
		if(null!=searchKey && searchKey!=""){
			for(PinCode a  :pinCodeList){
				if(a.getPinCode().equals(searchKey)){
					selectedPinCodeList.add(a);
				}
			}
		}
		return selectedPinCodeList;
	}
}
