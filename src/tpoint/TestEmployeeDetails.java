package tpoint;

public class TestEmployeeDetails {

	
	
	public static void main(String[] args){
		
		EmployeeDetails n1 = new EmployeeDetails();
		n1.setname("Vasu");
		n1.setid(9542);
		n1.setcity("Fremont");
		n1.setzip(94538);
		n1.setdesignation("Java");
	
		
System.out.println("Name:"+ " " +n1.getname());
System.out.println("Employee Id:"+ " " +n1.getid());
System.out.println("Designation:"+ " "+n1.getdesignation());
System.out.println("city: "+ " " +n1.getcity());
System.out.println("Zip code:"+ " " +n1.getzip());
		
		
	}
	
	
}
