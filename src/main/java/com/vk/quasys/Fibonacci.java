package com.vk.quasys;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Printing the first 10 fibonacci series");
		
//	    Stream.iterate(new int[] {0, 1}, t -> new int[] {t[1], t[0] + t[1]})
//	    .limit(10)
//	    .map(t -> t[0])
//	    .forEach(System.out::println);

		Stream.iterate(new int[] {0,1}, t-> new int[] {t[1], t[0] + t[1]})
		.limit(10)
		.map(t -> t[0])
		.forEach(System.out::println);
		
	    System.out.println("Recursive Printing the first 10 fibonacci series");
	    
	    IntStream.range(1,  10)
	    .forEach(i -> System.out.println(fib(i)));
	    
	}
	
	private static int fib(int i) {
		if(i<=1) {
			return i;
		}
		return fib(i - 1) + fib(i - 2);
	}

}
