package lab1;

public class Employee1 {
	
	
	public static void main(String[] args) {
	Employee emp1 = new Employee("Brinda"
	, 118, 60500);
	Employee emp2 = new Employee("Disha"
	, 119, 52450);
	System.out.println("Initial Employee details");
	emp1.displayDetails();
	emp2.displayDetails();
	emp1.increaseSalary(10);
	emp2.increaseSalary(5);
	System.out.println("Updated Employee details:");
	emp1.displayDetails();
	emp2.displayDetails();
	}
	}


