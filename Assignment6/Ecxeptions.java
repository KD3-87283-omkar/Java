package com.p1;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception
{
     public ExceptionLineTooLong()
     {
    	 super("length of input is too long");
     }
	
}
public class Ecxeptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter String");
       Scanner sc =new Scanner(System.in);
       String s=sc.nextLine();
       
       try {
    	   if(s.length()>8)
    	   {
    		   throw new ExceptionLineTooLong();
    	   }
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
       finally{
           System.out.println("program finished");
       }
	}

}
