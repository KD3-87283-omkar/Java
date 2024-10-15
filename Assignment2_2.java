import java.util.*;

public class Assignment2_2 {

	static void print()
	{
		System.out.println("Menu Card");
		System.out.println("**********************");
		System.out.println("Dosa");
		System.out.println("Samosa");
		System.out.println("Idli");
		System.out.println("Generate Bill");
		System.out.println("**********************");
		System.out.println("Enter your choice and quantity");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int dosa = 20;
		int samosa = 15;
		int idli = 30;
		int bill=0;
		int ch;
		print();
		while ((ch = sc.nextInt()) != 0) {
			int q;
			switch (ch) {
		
			case 1:
               System.out.println("Enter Quantity");
               q=sc.nextInt();
               bill+=dosa*q;
               print();
				break;
			case 2:
				System.out.println("Enter Quantity");
	             q=sc.nextInt();
	              bill+=samosa*q;
	              print();
				break;
			case 3:
				System.out.println("Enter Quantity");
	             q=sc.nextInt();
	              bill+=samosa*q;
	              print();
				break;
			case 4:
				System.out.println("ToTAL BILL IS:"+bill);
				return;

			}
		}

	}

}
