package com.infotech.client;

//Overloaded operator in String
public class ClientTest4 {

	public static void main(String[] args) {
		//if you have two strings
		String str1 = "Hi";
		String str2 = "Hello";
		
		//You can use '+' operator to concatenate them
		str1 = str1 + str2;
		System.out.println("str1 " + str1);
		
		//Or, to make it more concise
		str1 += str2;
		System.out.println("str1 " + str1);
	}
}
