package com.nt.miniproject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainEmployee {
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "Roshan", 7000));
		al.add(new Employee(2, "Dibya", 8000));
		al.add(new Employee(3, "Dinesh", 1000000));
		al.add(new Employee(4, "Amrit", 800000000));
		al.add(new Employee(101, "Rubul", 990090));
		//display the emp whose salary is greater than 7000
		al.stream().filter(x->x.getSalary()> 7000).forEach(System.out::println);
	System.out.println("...............................................................");	
		//display the emp count whose salary is greater than 7000
		
		long count = al.stream().filter(x->x.getSalary()>7000).count();
		System.out.println(count);
		System.out.println("///////////////////////////////////////////////////");
		//finding the emp name whose having high salary
		Optional<String> max = al.stream(). max(Comparator.comparing(Employee::getSalary)).map(Employee::getName);
		System.out.println(max.get());
		
		
		
		
	}

}
