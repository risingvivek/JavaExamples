package com.vk.quasys;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SummingNaturalInteger {

	public static void main(String[] args) {
		
        System.out.println("Please enter a natural number");
        Scanner input = new Scanner(System.in);
        Integer value = input.nextInt();
        input.close();

        System.out.println(IntStream.range(1, value)
        .mapToDouble(Integer::valueOf)
        .sum());
        
//        Integer sum = value.reduce(0, Integer::sum);
        System.out.println (value * (value + 1) / 2);

		
	}

}
