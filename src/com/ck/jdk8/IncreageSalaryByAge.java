package com.ck.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncreageSalaryByAge {
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("chuman", 22, 1000));
		employees.add(new Employee("kumar", 21, 2000));
		employees.add(new Employee("panda", 26, 3000));
		employees.add(new Employee("santosh", 28, 6000));
		employees.add(new Employee("parida", 24, 2000));
		
		System.out.println(employees);
		
		List<Employee> incSalary = employees.stream().map(e -> {
			if(e.getAge() > 25) {
				e.setSalary((e.getSalary()*1.10));
			}
			return e;
		}).collect(Collectors.toList());
		
	System.out.println(incSalary);
	}

}
