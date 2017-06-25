package com.ibm.cas.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility functions for Strings
 *
 */
public class StringUtil {
	

	
	public static boolean isNullOrEmpty(String input){
		if( input == null || input.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isInteger(String input){
		try{
			Integer.parseInt(input);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public static String generateIntegerSQLSearchStr(List<Integer> integerList){
		String str = integerList.toString();
		return str.substring(1,str.length()-1);
	}
	
	public static List<String> generateStringFieldList(String attributeFieldStr){
		if(isNullOrEmpty(attributeFieldStr)){
			return null;
		}
		List<String> attributeFieldList = new ArrayList<String>();
		String[] attributeFields = attributeFieldStr.split(",");
		for(int i=0; i<attributeFields.length;i++){
			attributeFieldList.add(attributeFields[i].trim());
		}
		return attributeFieldList;
	}
	
	public static List<Integer> generateIntegerFieldList(String bomFieldStr){
		if(isNullOrEmpty(bomFieldStr)){
			return null;
		}
		List<Integer> bomFieldList = new ArrayList<Integer>();
		String[] bomFields = bomFieldStr.split(",");
		for(int i=0; i<bomFields.length;i++){
			bomFieldList.add(Integer.valueOf(bomFields[i].trim()));
		}
		return bomFieldList;
	}
	
	public static boolean isStringEquals(String str1, String str2){
		if(isNullOrEmpty(str1)&&isNullOrEmpty(str2)){
			return true;
		}else{
			if(str1 != null && str2 != null){
				return str1.equals(str2);
			}
		}
		return false;
	}
	
	public static String setToString(Set<Integer> sgids){
		if(sgids==null||sgids.isEmpty()){
			return "";
		}else{
			String s = sgids.toString();
			return s.substring(1, s.length()-1).replaceAll(" ", "");
		}
	}
	
	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	public static boolean isEmail(String str) {
		String regex = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
		return match(regex, str);
	}
	
	public static String getDomain(String url) {
		String pattern = "((http://)|(https://))?([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,6}(/)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(url);
		if (m.find()) {
			return m.group();
		}
		return "";
	}
	
}
