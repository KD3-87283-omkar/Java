package com.p1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="nitin";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev==s);
	
	   int start=0;
	   int e=s.length()-1;
	   while(start<e)
	   {
		 if(s.charAt(start)!=s.charAt(e))
		 {
			 System.out.println("not palindrome :"+s);
			 return;
		 }
		   start++;
		   e--;
	   }
	   System.out.println("string is palindrome :"+s);
		
		
	}

}
