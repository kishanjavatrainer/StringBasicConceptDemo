package com.infotech.client;

public class ClientTest3 {
	
	//String intern() method
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		if (str1 == str2) {
			System.out.println("str1 and str2 are same");
		} else {
			System.out.println("str1 and str2 are not same");
		}
		String str3 = new String("abc");
		String str4 = new String("abc").intern();
		if (str3 == str4) {
			System.out.println("str3 and str4 are same");
		} else {
			System.out.println("str3 and str4 are not same");
		}

		if (str1 == str4) {
			System.out.println("str1 and str4 are same");
		} else {
			System.out.println("str1 and str4 are not same");
		}
	}
}
