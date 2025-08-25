package lab1;

public class Employee {
	String name;
	int id;
	double salary;
	Employee(String name, int id, double salary) {
	this.name = name;
	this.id = id;
	this.salary = salary;
	}
	void displayDetails() {
	System.out.println("Employee id: " + id);
	System.out.println("Name: " + name);
	System.out.println("Salary: " + salary);
	}
	void increaseSalary(double percentage) {
	double increment = (salary * percentage) / 100;
	salary = salary + increment;
	}}
	