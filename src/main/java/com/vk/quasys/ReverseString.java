package com.vk.quasys;

import java.util.Scanner;

public class ReverseString {

	public static void main(String... args) {
		
		System.out.println("Please enter a string to be reversed");
		Scanner input = new Scanner(System.in);
	    String value = input.nextLine();
	    input.close();
	    StringBuffer sb = new StringBuffer();
	    for(int i= value.length() -1; i >= 0; i --) {
	    	    sb.append(value.charAt(i));
	    }
	    
	    System.out.println("Input value is :"+sb);
	    System.out.println("Recursive reverse: ");
	    System.out.println(recursiveReverse(value));
	}
	
	private static String recursiveReverse(String s) {
		
//		if (s.isEmpty()) {return s;}
//		System.out.println(s);
//		return recursiveReverse(s.substring(1)) + s.charAt(0);
		
		if (s.isEmpty()) return s;
		
		return recursiveReverse(s.substring(1)) + s.charAt(0);
		

	}
}
