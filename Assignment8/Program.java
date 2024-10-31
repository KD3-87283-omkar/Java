package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Program {
	public static void saveProjects(Set<Project> obj) {
		try (FileOutputStream fos = new FileOutputStream("projects.db")) {
			try (BufferedOutputStream fob = new BufferedOutputStream(fos)) {
				try (ObjectOutputStream oos = new ObjectOutputStream(fob)) {
					oos.writeObject(obj);
				}
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

	}

	public static Set<Project> loadProject() {

		try (FileInputStream fis = new FileInputStream("projects.db")) {
			try (BufferedInputStream fib = new BufferedInputStream(fis)) {
				try (ObjectInputStream ois = new ObjectInputStream(fib)) {
					Set<Project> set = (Set<Project>) ois.readObject();
					return set;
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
	public static int menu(Scanner sc) {
				System.out.println("0. EXIT");
				System.out.println("1. Display project");
				System.out.println("2.  Add Project");
				System.out.println("3.  delete project by id");
				System.out.println("4.  copy all project to List");
				System.out.println("5. Display project from list");
				System.out.println("6.  Sort all project in list by cost");
				System.out.println("7.  Find project with max team size");
				System.out.println("8.  Count all project of java technology");
				return sc.nextInt();

			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Project> s=(Set<Project>)loadProject();
//        s.add(new Project(1,"Train Reservation System",4,50000,"java"));;
//        s.add(new Project(2,"Airline Reservation System",3,6000000,".NET"));
//        s.add(new Project(4,"Online Grocery Shop", 6, 3000000, "Java"));
//        s.add(new Project(5, "Online Book Shop", 2, 3000000,".NET"));
       
        List<Project> l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int ch;
        while((ch=menu(sc))!=0)
        {
        	switch (ch) {
			case 1:
				   for(Project p:s)
				   {
					   System.out.println(p);
				   }
				break;
			case 3:{
				Project pr=new Project();
			    System.out.println("Enter id to search");
			    int i=sc.nextInt();
			    pr.id=i;
			    System.out.println(s.remove(pr));
			    break;}
			case 4:
				l.addAll(s);
				break;
			case 5:
				l.forEach(System.out::println);
				break;
			case 6:
				l.sort((o1,o2)-> Double.compare(o1.projectCost,o2.projectCost));
				l.forEach(System.out::println);
				break;
			case 7:
				Project p=(Project)Collections.max(l,(o1,o2)-> o2.teamSize-o1.teamSize);
				System.out.println(p);
			default:
				break;
			}
        }
       
        saveProjects(s);
	}
}
