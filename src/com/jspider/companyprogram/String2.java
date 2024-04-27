package com.jspider.companyprogram;

public class String2 {

	public static void main(String[] args) {
		
		String s="aba ccc agah";
		 
		String arr[]=s.split("");
		
		for (int i = 0; i < arr.length; i++) {
			String rev="";
			for (int j = arr[i].length()-1; j>=0;j--) {
				rev+=arr[i].charAt(j);
			}
			if (rev.equalsIgnoreCase(arr[i])) {
				System.out.println(arr[i]+"");
			}
		}
	}
}
