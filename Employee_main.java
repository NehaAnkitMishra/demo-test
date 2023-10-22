package com;

public class Employee_main extends Employee {

	public static void main(String[] args) {
		Employee_main em = new Employee_main();
		
		em.name = "Neha";
		em.salary = 50000;
		em.Department ="Development";
		System.out.println("Lets beging Programing");
		System.out.println("Employee details :"+"  Employee name :"+em.getName() +"  Salary :"+ em.getSalary()+" dapartment :"+em.getDepartment());

	}

}
