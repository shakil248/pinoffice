package com.khan.pincode.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.khan.pincode.model.A;

public class CsvReaderUtil {
	
	public static List<A> getPinCodeData() {
		String csvFile = "d:/pincodedata.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		List<A> pinCodeList = new ArrayList<A>();

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] pinCodeArray = line.split(cvsSplitBy);
				System.out.println(pinCodeArray[0]);
				A a  = new A();
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
