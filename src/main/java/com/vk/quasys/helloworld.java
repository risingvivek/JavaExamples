/**
 * 
 */
package com.vk.quasys;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vivekkumar
 *
 */
public class helloworld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
	
		
		result.stream()
		    .filter(s->s.getAge() > 35);
		System.out.println(result);
		
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("first", 10);
		maps.put("second", 20);
		maps.put("third", 30);
		maps.put("fourth", 40);
		maps.put("fifth", 50);
		maps.put("sixth", 60);
		maps.put("sixth", 60);

		
		maps.forEach((k,v)->System.out.println("Digital value of "+k+ " is "+v));
	}

}
class Developer {
	
	String name;
	BigDecimal salary;
	int age;
	
	public Developer(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
