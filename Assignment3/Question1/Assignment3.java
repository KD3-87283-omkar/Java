package demo2;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Invoice i1=new Invoice("1","Apple iphone16",2,150000.0);
     Invoice i2=new Invoice();
    i2.setPartnumber("2");
    i2.setPartDescription("boat headphone");
    i2.setPrice(1000.20);
    i2.setQuantity(1);
    
    double amt=i1.calculateInvoiceAmount();
    System.out.println(amt);
    
    
    double amt2=i2.calculateInvoiceAmount();
    System.out.println(amt);
    
		
		
		
	}

}
