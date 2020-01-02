package com.vk.quasys;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IsPrimeNumber {

	public static void main(String[] args) {

		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

//		int sqrt = (int) Math.sqrt(input);
//		boolean isPrime = IntStream.rangeClosed(2, sqrt).anyMatch(i -> input % i == 0);
		int squareRoot = (int) Math.sqrt(input);
		boolean isPrime = IntStream.rangeClosed(2, squareRoot).anyMatch(i -> input % i ==  0);
		if (isPrime) {
			System.out.println("Its not a prime");
		} else {
			System.out.println("Yes its a prime");
		}

	}

}
