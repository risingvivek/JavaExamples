package com.vk.quasys;

import com.vk.quasys.interfaces.HelloLambda;

public class LambdaExpressionExample {
	public static void main(String[] args) {
	   HelloLambda hello = () -> System.out.println("Hello world");
	    hello.sayHello(); 
	}
}
