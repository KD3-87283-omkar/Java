import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc=new Scanner(System.in);
     
		
		if(sc.hasNextDouble() && !sc.hasNextInt())
		{
		   double a=sc.nextDouble();
		if(sc.hasNextDouble() && !sc.hasNextInt())
		{
		     double b=sc.nextDouble();
		     double avg=(a+b)/2;
		     System.out.println(avg);
		   
		}
		else 
		{
			System.out.println("number is not double:");	
		}
		}
		else 
		{
			System.out.println("number is not double");	
		}
		
	}

}
