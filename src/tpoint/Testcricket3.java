package tpoint;

public class Testcricket3{
	// Object calling through reference 
	
public static void main(String[] args) {
		
		// Creating object 
	Cricket d = new Cricket();
	d.age=43;
	d.country="India";
	d.name="Sehwag";
	d.totalOversPlayed=3000.5;
	d.totalruns=20000;	
	
	
	//creating second object
	
	Cricket d1 = new Cricket();
	d1.age=24;
	d1.country="India";
	d1.name="Yuvi";
	d1.totalOversPlayed=4000.7;
	d1.totalruns=40000;
		
	//printing Player1 and 2 details	
	System.out.println("Here is player1 details:"+"   "+ "Name:" +d.name +"   " +  "Age:" +  d.age +"   " + "Country:" +d.country+"   " + "TotalOversPlayed:" + d.totalOversPlayed +"   "+ "Total runs:"+ d.totalruns);	

	System.out.println("Here is player2 details:" +"   "+ "Name:" +d1.name +"   " +  "Age:" +  d1.age +"   " + "Country:" +d1.country +"   "+ "TotalOversPlayed:"+ d1.totalOversPlayed +"   "+ "Total runs:"+ d1.totalruns);
	}


}
