package com.app.encapsulation;

public class Verification 
{
	public static void main(String[] args) 
	{
		Company company = new Company();
		Employee[] employees = company.addEmployess();
		
		for (Employee employee : employees)
		{
			System.out.println(employee.getId()+"\t"+employee.getName());
		}
	}
}
/*output:
		1	Divya
		2	Mayuri
*/

