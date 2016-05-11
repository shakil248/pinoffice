package com.khan.pincode.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.khan.pincode.model.PinCode;

public class CsvReaderUtil {
	
	public static List<PinCode> getPinCodeData() {
		String csvFile = "d:/pincodedata.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		List<PinCode> pinCodeList = new ArrayList<PinCode>();

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] pinCodeArray = line.split(cvsSplitBy);
				System.out.println(pinCodeArray[0]);
				PinCode a  = new PinCode();
				a.setArea(pinCodeArray[0]);
				a.setPinCode(pinCodeArray[1]);
				a.setDistrict(pinCodeArray[2]);
				a.setState(pinCodeArray[3]);
				
				pinCodeList.add(a);
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return pinCodeList;
	  }
}
