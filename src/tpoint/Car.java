package tpoint;

public class Car{
 
	//variable decleration
	String color;
	int Price;
	String companyname;	
	
	void insertRecord(String i, int p, String n ){

color=i;
Price=p;
companyname=n;
		
	}
	
	void displayInformation(){ System.out.println("color is:"+color +"  "+"Price is:"+Price+"  " + "Company name is:"+companyname);
		
	}
	
}
	
