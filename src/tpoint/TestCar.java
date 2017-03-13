package tpoint;
//object initialization through method
public class TestCar{
	public static void main (String[] args){
		
		Car c1=new Car();
		Car c2=new Car();
		

		c1.insertRecord("red", 20000, "Audi");
c1.displayInformation();
		c2.insertRecord("black", 10000, "Honda");
		c2.displayInformation();
		
		
	}
	
}
