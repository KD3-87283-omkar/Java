package demo2;

public class Invoice {

	String partnumber;
	String partDescription;
	int quantity;
	double price;

	public Invoice() {

	}

	public String getPartnumber() {
		return partnumber;
	}

	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			this.quantity = 0;
		}
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.quantity = 0;
		}
		this.price = price;
	}

	public Invoice(String partnumber, String partDescription, int quantity, double price) {
		this.partnumber = partnumber;
		this.partDescription = partDescription;
		if (quantity < 0) {
			this.quantity = 0;

		} else {
			this.quantity = quantity;
		}
		this.price = price;
	}

	public double calculateInvoiceAmount() {
		double amt = 0;
		amt = price * quantity;
		return amt;
	}

}
