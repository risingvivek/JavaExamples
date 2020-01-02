package com.vk.quasys;

import java.util.Scanner;

public class StringWordCount {

	public static void main(String[] args) {
		
		System.out.println("Please enter the sentence");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String strArr[] = str.split(" ");
		System.out.println("Total word count is ");
		System.out.print(strArr.length);

	}

}
