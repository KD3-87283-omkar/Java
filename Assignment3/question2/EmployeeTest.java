package question2;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1=new Employee("om","yadav",1000.00);
        Employee e2=new Employee("Harshad","Warsi",500.00);
        
        e1.displayYearSalary();
        e2.displayYearSalary();
        
        
        double s1=e1.getSalary()+e1.getSalary()*0.1;
        double s2=e2.getSalary()+e2.getSalary()*0.1;
        e1.setSalary(s1);
        e2.setSalary(s2);
        
      System.out.println("After Raising Salary of Employees");
      e1.displayYearSalary();
      e2.displayYearSalary();
	}

}
