package Assignment5;

import java.util.Scanner;



public class FruitBasket {
   public static int menu(Scanner sc)
   {
	   System.out.println("1 for Add Mango");
	   System.out.println("2 for Add orange");
	   System.out.println("3 for Add Apple");
	   System.out.println("4 for Display name");
	   System.out.println("5 For Display name,color,weight ,taste of all fresh fruits");
	   System.out.println("6 Display tastes of all stale(not fresh) fruits");
	   System.out.println("7 Mark a fruit as stale");
	   System.out.println("0 for exit");
	   System.out.println("Enter your chioce");
	   int ch=sc.nextInt();
	    return ch;
	   
   }
	public static void main(String[] args) {
		Fruit[] f=new Fruit[3];
		Scanner sc=new Scanner(System.in);
		int c;
		int i=0;
		while((c=menu(sc))!=0)
		{
			switch(c)
			{
			case 1:
				if(i<3)
				{
					f[i]=new Mango();
					f[i].accept(sc);
					i++;
				}
			    break;
			case 2:
				if(i<3)
				{
					f[i]=new Orange();
					f[i].accept(sc);
					i++;
				}
				break;
			case 3:
				if(i<3)
				{
					f[i]=new Apple();
					f[i].accept(sc);
					i++;
				}
				break;
			case 4:
				for(Fruit ft:f)
				{
					System.out.println(ft.getName());
				}
				break;
			case 5:
				for(int t=0;t<i;t++)
				{
					if(f[t].isFresh())
					{
					  f[t].display();
					  System.out.println(f[t].taste());
					}
				}
				break;
			case 6:
				for(int t=0;t<i;t++)
				{
					if(!f[t].isFresh())
					{
						System.out.println(f[t].taste());
;					}
				}
				break;
			case 7:
				System.out.println("Enter index to mark fruit as stale");
				int in=sc.nextInt();
				if(in>=0 && in<3)
				{
				   f[in].setFresh(false);
				}
				else {
					System.out.println("invalid index");
				}
				break;
			case 8:
				for(int t=0;t<i;t++)
				{
					if(f[t].taste()=="sour")
					{
						f[t].setFresh(false);
					}
				}
			}
		}
		
		
	}

}
