package com.ibm.cas.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetUtil {

	
	public static boolean isColumnExists(ResultSet rs, String columnName){
		try {
			if (rs.findColumn(columnName) >= 0 ) {
				return true;
			} 
		}
		catch (SQLException e) {
			return false;
		}
		return false;
	}
}
