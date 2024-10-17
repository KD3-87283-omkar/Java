package question2;

public class Employee {
String first_Name;
String last_Name;
double salary;

public Employee(String first_Name, String last_Name, double salary) {
	super();
	this.first_Name = first_Name;
	this.last_Name = last_Name;
	if(salary>0)
	{
	this.salary = salary;
	}
}
public String getFirst_Name() {
	return first_Name;
}
public void setFirst_Name(String first_Name) {
	this.first_Name = first_Name;
}
public String getLast_Name() {
	return last_Name;
}
public void setLast_Name(String last_Name) {
	this.last_Name = last_Name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	if(salary>0)
	{
	this.salary = salary;
	}
}

public void displayYearSalary()
{
	System.out.println(salary*12);
}	
}
