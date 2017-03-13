package tpoint;
// two objects creation
//2 objects creating inside class
public class Cricket1 {
//variable decleration
	String name;
	int age;
	int totalruns;
	String country;
	Double totalOversPlayed;
	
	
	
	public static void main(String[] args) {
		
		// Creating object 
	Cricket d = new Cricket();
	d.age=34;
	d.country="India";
	d.name="Dhoni";
	d.totalOversPlayed=4000.5;
	d.totalruns=50000;	
	
	
	//creating second object
	
	Cricket d1 = new Cricket();
	d1.age=52;
	d1.country="India";
	d1.name="Sachin";
	d1.totalOversPlayed=6000.7;
	d1.totalruns=60000;
		
	//printing Player details	
	System.out.println("Here is player1 details:"+"   "+ "Name:" +d.name +"   " +  "Age:" +  d.age +"   " + "Country:" +d.country+"   " + "TotalOversPlayed:" + d.totalOversPlayed +"   "+ "Total runs:"+ d.totalruns);	

	System.out.println("Here is player2 details:" +"   "+ "Name:" +d1.name +"   " +  "Age:" +  d1.age +"   " + "Country:" +d1.country +"   "+ "TotalOversPlayed:"+ d1.totalOversPlayed +"   "+ "Total runs:"+ d1.totalruns);
	}

}

