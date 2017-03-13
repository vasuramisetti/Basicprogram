package tpoint;
// Creating object  
//2nd program 
public class Cricket {
	
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
		
	//printing Player details	
	System.out.println("Here is player details:"+ "Name:" +d.name  +  "Age:" +  d.age  + "Country:" +d.country + "Total Overs Played:" + d.totalOversPlayed + "Total runs:"+ d.totalruns);	

	}

}
