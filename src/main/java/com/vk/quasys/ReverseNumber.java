package com.vk.quasys;

import java.util.Scanner;
import static java.lang.StrictMath.pow;
public class ReverseNumber {

	public static void main(String... args) {
		
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		input.close();
		System.out.println(recursiveInt(value));
		
	}
	
	public static int recursiveInt(int i) {
		System.out.println(i);
		if (i < 1) {
			System.out.println(i);
			return i;
		} else {
			int x = i % 10;
			System.out.println("x percent 10 is "+x);
			int length = (int) Math.log10(i) +1;
			System.out.println("length is "+length);
			return (int) (x * pow(10, length)) + recursiveInt(i / 10);
		}
		
	}
}
