package Assignment5;

import java.util.Scanner;

public abstract class Fruit {
String color;
double weight;
String name;
boolean isFresh;
public Fruit()
{
	System.out.println("fruit ctor");
}
@Override
public String toString() {
	return "Fruit [color=" + color + ", wight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
}
public Fruit(String color, double wight, String name, boolean isFresh) {
	this.color = color;
	this.weight = wight;
	this.name = name;
	this.isFresh = isFresh;
}


public void accept(Scanner sc)
{
  System.out.println("Enter fruit name");
  name=sc.nextLine();
  sc.next();
  
  System.out.println("Enter fruit weight");
  weight=sc.nextDouble();
  
  System.out.println("Enter fruit color");
  color=sc.nextLine();
  sc.next();
  System.out.println("Fruit fresh or not ? ");
  isFresh=sc.nextBoolean();
}
public void display()
{
  System.out.println("fruit name is: "+name);
  
  
  System.out.println("fruit weight is :"+weight);

  System.out.println("fruit color is :"+color);
  System.out.println("Is fresh fruit"+isFresh);
  
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getWight() {
	return weight;
}
public void setWight(double wight) {
	this.weight = wight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isFresh() {
	return isFresh;
}
public void setFresh(boolean isFresh) {
	this.isFresh = isFresh;
}
public abstract String taste();
}
