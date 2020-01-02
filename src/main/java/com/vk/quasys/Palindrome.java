package com.vk.quasys;

import java.util.Scanner;
import java.util.stream.IntStream;
/**
 * Verify if an input string is palindrome.
 * @author vivekkumar
 *
 */
public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Please enter a String to find if its palindrome");
		Scanner input = new Scanner(System.in);
		String value = input.next();
		input.close();
		System.out.println("Its "+ (ifPalindrome(value) ? "":"not" )+" a palindrome");
	}



	private static boolean ifPalindrome(String value) {

		//METHOD 1 . JUST UNCOMMENT.
		
//		int length = value.length();
//		for (int i = 0; i < length / 2; i++) {
//          if (value.charAt(i) != (value.charAt(length-i-1))){
//        	   System.out.println(" Oh its not a palindrome");
//        	   return false;
//          }
//		}
//        return true;
		
		
		// METHOD 2.
		return IntStream.range(0,  value.length() /2)
		.noneMatch(i -> value.charAt(i) != value.charAt(value.length()-i -1));
		
	}
}
