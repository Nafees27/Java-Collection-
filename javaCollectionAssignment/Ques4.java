/*
 	4) Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value
 
 */

package javaCollectionAssignment;

import java.util.*;

public class Ques4 {

	public static void main(String[] args) 
	{
		
		Employees emp1 = new Employees("josh", 28, "Lead");
        Employees emp2 = new Employees("jaggu", 25, "Senior Software Eng");
        Employees emp3 = new Employees("Arvy", 29, "Associate");
        Employees emp4 = new Employees("jeetu", 39, "Architect");

        Map<Employees, Integer> map = new HashMap<>();

        map.put(emp1, 6592);
        map.put(emp2, 6522);
        map.put(emp3, 6500);
        map.put(emp4, 6782);
        
        for (Employees key : map.keySet()) 
        {
            System.out.println(key + "   Salary : " + map.get(key));
        }

	}

}

class Employees 
{
	String name;
	int age;
	String designation;
	
	public Employees(String naam, int ag, String des)
	{
		name = naam;
		age = ag;
		designation = des;
	}
	
	@Override
	public String toString() 
	{
		return "Name of Employee : " + name  +"		Age : "+ age + "   	Designation : " + designation +"";
	}
}
