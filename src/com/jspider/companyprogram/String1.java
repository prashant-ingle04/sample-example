package com.jspider.companyprogram;

public class String1 {

	public static void main(String[] args) {
		String s="Malayalam";
		String rev="";
	
		for (int i = s.length()-1; i>=0; i--) {
			rev+=s.charAt(i);
		}
		
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("String is not palindrome");
			System.out.println("completed");
		}
	}
}
