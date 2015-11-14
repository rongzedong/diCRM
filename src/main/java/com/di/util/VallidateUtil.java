package com.di.util;

public class VallidateUtil {
	public boolean isNotNullString(String value, String savedValue) {
		if (value == "" || value == null)
			return false;
		
		return true;
	}
	
	public boolean isNotEqualInt(int value, int savedValue) {
		if (value != savedValue)
			return false;
		return true;
	}
}
