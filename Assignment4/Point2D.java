package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	int x;
	int y;
	Scanner sc=new Scanner(System.in);
	public Point2D()
	{
		
	}
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void accept()
	{
		System.out.println("Enter x and Y coordinate value ");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	
	public String getDetails()
	{
		return "X value is :"+x +" Y value is:"+y;
	}
	public boolean isEqual(Point2D p)
	{
		if(this.x==p.x && this.y==p.y)
		{
			return true;
		}
		return false;
	}
	public void calculateDistance(Point2D p)
	{
		if(isEqual(p))
		{
			System.out.println("Points are equal");
			display(p);
		}
		double tmp=(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y), x));
		double ans=Math.sqrt(tmp);
		System.out.println("Distance is :"+ans);
	}
	public void check(Point2D p)
	{
		if(isEqual(p))
		{
			System.out.println("points are Equal");
			display(p);
		}
		else {
			display(p);
			calculateDistance(p);
		}
		
	}
	public void display(Point2D p)
	{
		System.out.println("x1 is:"+this.x);
		System.out.println("Y1 is:"+this.y);
		System.out.println("X2 is:"+p.x);
		System.out.println("Y2 is:"+p.y);
	}
	
}

