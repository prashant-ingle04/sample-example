package com.jspider.companyprogram;


public class String3 {

	public static void main(String[] args) {
		String s="java is a highly secured language";
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			if (i==0 && s.charAt(i)!=(' ')) {
				count++;
			}else if (i<s.length()-1 && s.charAt(i)!=' ' && s.charAt(i-1)== ' ') {
				 count++;
			}
		}
		System.out.println(count);
	}
}
