package com.p1;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="abcde";
        
        String rev = "";
        
        for(int i=s1.length()-1;i>=0;i--)
        {
        	rev+=s1.charAt(i);
        }
        System.out.println(rev);
        
        StringBuilder sb=new StringBuilder("abcde");
        System.out.println(sb);
        
        int start=0;
        int end=sb.length()-1;
        while(start<end)
        {
        char temp=sb.charAt(start);
        char temp2=sb.charAt(end);
        sb.replace(start, start+1,String.valueOf(temp2));
        sb.replace(end, end+1, String.valueOf(temp));
        start++;
        end--;
        }
        System.out.println(sb);
        
        
        
//        sb=sb.reverse();
//        System.out.println(sb);
		  
	}

}
