
package Assignment7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class NameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
class CityComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.city.compareTo(o2.city);
	}
	
}
class MarkComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.mark,o1.mark);
	}
	
}
public class Program {
	
	 public static int menu(Scanner sc)
	   {
		   System.out.println("1 Sort on their name");
		   System.out.println("2 Sort on their city");
		   System.out.println("3 Sort on their mark descending");
		   System.out.println("4 Sort on their id");
		   
		   System.out.println("0 for exit");
		   System.out.println("Enter your chioce");
		   int ch=sc.nextInt();
		    return ch;
		   
	   }
	 public static void display(Student []arr)
	 {
		 for(Student ar:arr)
		 {
			 System.out.println(ar);
		 }
	 }
	public static void main(String args[])
	{
		Student arr[]=new Student[5];
		arr[0]=new Student(1,"omkar","satara",100);
		arr[1]=new Student(2,"harshad","nagpur",80);
		arr[2]=new Student(3,"Mayur","raygad",90);
		arr[3]=new Student(4,"Anil","pune",60);
		arr[4]=new Student(5,"mukesh","mumbai",85);
		Scanner sc=new Scanner(System.in);
		int c;
		while((c=menu(sc))!=0)
		{
			switch(c)
			{
			case 1:
				Arrays.sort(arr,new NameComparator());
				display(arr);
				break;
			case 2:
				Arrays.sort(arr,new CityComparator());
				display(arr);
				break;
			case 3:
				Arrays.sort(arr,new MarkComparator());
				display(arr);
				break;
			case 4:
				Arrays.sort(arr);
				display(arr);
				break;
			default :
				System.out.println("wrong chioce");
			
			}
		}
		
		
		
	}
}
