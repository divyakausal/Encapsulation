package com.app.encapsulation;

public class Company 
{
	public Employee[] addEmployess()
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Divya");
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Mayuri");
		
		Employee[] employees = new Employee[2];
		employees[0] = e1;
		employees[1] = e2;
		
		return employees;
	}
}
