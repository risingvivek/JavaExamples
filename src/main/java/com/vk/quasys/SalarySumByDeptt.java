package com.vk.quasys;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vk.quasys.dto.Employee;

public class SalarySumByDeptt {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("fistName", "firstCompany", 123.12));
		empList.add(new Employee("secondName", "secondCompany", 122.123));
		empList.add(new Employee("thirdName", "thirdCompany", 190.30));
		empList.add(new Employee("fourthName", "firstCompany", 223.11));
		empList.add(new Employee("fifthName", "thirdCompany", 323.12));
		
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary))));

	}

}
