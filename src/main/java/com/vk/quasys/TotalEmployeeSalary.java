package com.vk.quasys;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vk.quasys.dto.Employee;

public class TotalEmployeeSalary {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("fistName", "firstCompany", 123.12));
		empList.add(new Employee("secondName", "secondCompany", 122.123));
		empList.add(new Employee("thirdName", "thirdCompany", 190.30));
		empList.add(new Employee("fourthName", "fourthCompany", 223.11));
		empList.add(new Employee("fifthName", "fifthCompany", 323.12));
		
		
		
        Double totalSalary = empList
        		                .stream()
        		                .mapToDouble(x -> x.getSalary())
        		                .sum();
        System.out.println("Total combined Salary "+totalSalary);
        
        System.out.println(empList
        		               .stream()
        		               .collect(Collectors.summingDouble(Employee::getSalary))
        		               .doubleValue());
	}

}
