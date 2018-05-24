package com.infotech.client;
//Comparing Strings using .equals method
public class ClientTest5 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str4 = new String("abc");
		// comparing content
		if (str1.equals(str4)) {
			System.out.println("str1 and str4 are same");
		} else {
			System.out.println("str1 and str4 are not same");
		}
		// comparing references
		if (str1 == str4) {
			System.out.println("str1 and str4 are same");
		} else {
			System.out.println("str1 and str4 are not same");
		}
	}
}
