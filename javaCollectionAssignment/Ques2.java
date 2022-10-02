
/*
 	2) Given the following class
	Employee class{ Double Age; Double Salary; String Name}
	Design the class in such a way that the default sorting should work on firstname and lastname.
 	
 */

package javaCollectionAssignment;

import java.util.*;

public class Ques2 {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(27.0,30000.5,"Nafees","Ahmad");
        	Employee emp2 = new Employee(28.5,40000.6,"Ayaaz","Khan");
        	Employee emp3 = new Employee(30.1,50000.7,"Saif","Ali");

        	List<Employee> employeeList = new ArrayList<>();
        	employeeList.add(emp1);
        	employeeList.add(emp2);
        	employeeList.add(emp3);

        	Collections.sort(employeeList);
        	System.out.println(employeeList);

	        employeeList.sort((t1,t2)-> ((int)(t1.getAge() - t2.getAge())));
        	System.out.println("\n"+employeeList);
	}

}

class Employee implements Comparable<Employee>
{
    private Double age;
    private Double salary;
    private String firstName;
    private String lastName;

    public Employee(Double age, Double salary, String firstName, String lastName) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.firstName.equalsIgnoreCase(employee.getFirstName()))
            return (this.lastName.compareToIgnoreCase(employee.getLastName()));

        return (this.firstName.compareToIgnoreCase(employee.getFirstName()));
    }

    @Override

    public String toString() {
        return "FirstName : "+firstName + " LastName : "+ lastName+ " Salary : " + salary + " Age : " + age;
    }
}
