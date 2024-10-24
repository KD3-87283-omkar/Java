package Assignment7;

public class Student implements Comparable<Student>{
    private int roll;
    String name;
    String city;
    double mark;
    public Student()
    {
    	
    }
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public Student(int roll, String name, String city, double mark) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.mark = mark;
	}
	@Override
	public int compareTo(Student o) {
	
		return this.roll-o.roll;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", mark=" + mark + "]";
	}
	
}
