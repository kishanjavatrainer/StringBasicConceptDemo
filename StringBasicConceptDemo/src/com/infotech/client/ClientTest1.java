package com.infotech.client;

//String pool in Java example
public class ClientTest1 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		if (str1 == str2) {
			System.out.println("str1 and str2 are same");
		} else {
			System.out.println("str1 and str2 are not same");
		}
	}
}
